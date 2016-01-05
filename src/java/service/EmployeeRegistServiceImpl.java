/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.EmployeeRegistDaoImpl;
import org.springframework.stereotype.Service;
import vo.EmployeeRegistVo;

@Service
public class EmployeeRegistServiceImpl implements EmployeeRegistService{
    private EmployeeRegistDaoImpl employeeRegistDaoImpl;
    public void registEmployee(EmployeeRegistVo employeeRegistVo){
        employeeRegistDaoImpl = new EmployeeRegistDaoImpl();
        employeeRegistDaoImpl.registVo(employeeRegistVo);
    }
}
