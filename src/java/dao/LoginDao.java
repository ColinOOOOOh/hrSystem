/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import po.UserPo;

/**
 *
 * @author acer
 */
public interface LoginDao {

     public String checkUser(UserPo user);

}
