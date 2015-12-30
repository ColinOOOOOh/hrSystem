/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.sql.*;    //导入JDBC
import vo.LoginVo;

public interface LoginService {
    
    public String checkUserInfo( LoginVo user );

}
