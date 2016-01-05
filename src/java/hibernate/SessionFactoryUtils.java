package hibernate;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import cn.dyr.hrm.util.EncryptUtil;

public class SessionFactoryUtils {
	private static SessionFactory factory = null;

	private ThreadLocal<Session> threadSessions;
	private ThreadLocal<Transaction> threadTranscations;
	private ThreadLocal<String> threadId;

	private static SessionFactoryUtils _instance;

	static {
		_instance = new SessionFactoryUtils();
	}

	public static SessionFactoryUtils getInstance() {
		if (_instance == null) {
			_instance = new SessionFactoryUtils();
		}

		return _instance;
	}

	private SessionFactoryUtils() {
		this.threadSessions = new ThreadLocal();
		this.threadTranscations = new ThreadLocal();
		this.threadId = new ThreadLocal();
	}

	private static void rebuildSessonFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			factory = new Configuration().configure().buildSessionFactory(serviceRegistry);
		} catch (Throwable e) {
			System.out.println("failed to build Hibernate Session Factory. "+e.getMessage());
                        e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		if (factory == null) {
			rebuildSessonFactory();
		}

		return factory;
	}

	public static void releaseSessionFactory() {
		_instance.shutdown();

		factory.close();
		factory = null;
	}

	public void shutdown() {
		threadId = new ThreadLocal();
		threadSessions = new ThreadLocal();
		threadTranscations = new ThreadLocal();
	}

	public void forceClose() {
		this.threadTranscations.remove();
		this.threadSessions.remove();
		this.threadId.remove();
	}

	public boolean releaseCurrentSession() {
		boolean retValue = false;

		Session session = this.threadSessions.get();
		Transaction transaction = this.threadTranscations.get();

		if (session == null) {
			return false;
		}

		try {
			transaction.commit();
			retValue = true;


		} catch (Exception e) {
			transaction.rollback();

			retValue = false;
		} finally {


			session.close();

			this.threadTranscations.remove();
			this.threadSessions.remove();
			this.threadId.remove();
		}

		return retValue;
	}

	public Session getCurrentThreadSession() {
		Session session = this.threadSessions.get();
		if (session == null) {
			if (factory == null) {
				rebuildSessonFactory();
			}

			session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			this.threadSessions.set(session);
			this.threadTranscations.set(transaction);
			this.threadId.set(EncryptUtil.md5_16(UUID.randomUUID().toString()).substring(0, 6));

		}

		return session;
	}

	public Transaction getCurrentThreadTranscation() {
		return this.threadTranscations.get();
	}
}
