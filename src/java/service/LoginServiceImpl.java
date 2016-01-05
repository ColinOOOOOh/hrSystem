/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import javax.annotation.Resource;

import dao.LoginDao;
import dao.LoginDaoImpl;
import org.springframework.stereotype.Service;
import vo.LoginVo;

@Service 
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDao m_loginDao;

	@Override
	public String checkUserInfo(LoginVo user) {
		m_loginDao = new LoginDaoImpl();
		return m_loginDao.checkUser(user);
	}
}
