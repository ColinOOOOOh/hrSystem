/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import po.UserPo;
import dao.LoginDao;
import dao.LoginDaoImpl;
import java.sql.SQLException;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Resource
        private LoginDao m_loginDao = new LoginDaoImpl();

     public String checkUserInfo( UserPo user )throws SQLException{
        return  m_loginDao.checkUser(user);
    }
}
