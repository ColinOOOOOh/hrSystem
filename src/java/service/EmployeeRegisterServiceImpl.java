/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.EmployeeRegistDaoImpl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import po.AgencyPo;

/**
 *
 * @author acer
 */
@Service
public class EmployeeRegisterServiceImpl implements EmployeeRegisterService{
    @Resource
    private EmployeeRegistDaoImpl employeeRegistDao;
    @Override
    public List<AgencyPo> getAgencyList (){
        employeeRegistDao = new EmployeeRegistDaoImpl();
        return employeeRegistDao.getAgencyList();
    }
}
