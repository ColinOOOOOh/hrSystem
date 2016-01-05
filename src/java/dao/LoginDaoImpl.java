/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import hibernate.SessionFactoryUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import vo.LoginVo;
@Repository
public class LoginDaoImpl implements LoginDao {
        
       private final SessionFactoryUtils util;
    
        public LoginDaoImpl(){
            this.util = SessionFactoryUtils.getInstance();
        }
    
	@Override
	public String checkUser(LoginVo user) {
            Session session = this.util.getCurrentThreadSession();
            Query query = session.createQuery("from UserPo as u where u.userName=? and u.userPassword=?");
            query.setString(0, user.getUsername());
            query.setString(1, user.getPassword());
            List list = query.list();
            this.util.releaseCurrentSession();
            if (list.size() > 0) {
                return "SUCCESS";
            } else {
                return "FAILED";
            }
	}
}
