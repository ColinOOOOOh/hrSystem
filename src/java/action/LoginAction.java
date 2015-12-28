package action;
import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.opensymphony.xwork2.ActionSupport;


import po.*;
import service.LoginService;
import service.LoginServiceImpl;


	public class LoginAction extends ActionSupport
	{  
		private UserPo m_user; 
		private LoginService m_loginService;
		public UserPo getUser() {
			return m_user;
		}

		public void setUser( UserPo user) {
			this.m_user = user;
		}

		public String execute() 
		{
			try
			{
				
				m_loginService =new LoginServiceImpl();
				if (m_loginService.checkUserInfo(m_user).equals("SUCCESS")) 
				{
					HttpServletRequest request = ServletActionContext.getRequest();
					HttpSession session = request.getSession();
					session.setAttribute("u", m_user);
					return  "SUCCESS"; 
				}
				else
				{
					return "ERROR";
				}
			}catch(SQLException e)
			{
				System.out.println("SQL exception occurred while Loginning");
				return  "exception";  
			}
		}
	}

