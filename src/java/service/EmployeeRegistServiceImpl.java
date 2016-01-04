/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.EmployeeRegistDaoImpl;
import org.springframework.stereotype.Service;
import vo.EmployeeRegistVo;

/**
 *
 * @author acer
 */
@Service
public class EmployeeRegistServiceImpl {
    private EmployeeRegistDaoImpl employeeRegistDaoImpl;
    public void getRegistInfoVo(EmployeeRegistVo employeeRegistVo){
        employeeRegistDaoImpl = new EmployeeRegistDaoImpl();
        employeeRegistDaoImpl.getEmployeeRegistInfoVo(employeeRegistVo);
    }
}
