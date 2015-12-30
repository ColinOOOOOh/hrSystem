/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import org.springframework.stereotype.Repository;
import po.UserPo;
import vo.LoginVo;

/**
 *
 * @author acer
 */
@Repository
public class LoginDaoImpl implements LoginDao {
    
                    public String checkUser(LoginVo user) 
		{
                    if(user.getUsername().equals("davis") && user.getPassword().equals("123")){
                        return "SUCCESS";
                    }else{
                        return "FAILED";
                    }
                    
		}
}
