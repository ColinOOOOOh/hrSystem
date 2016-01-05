/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import hibernate.SessionFactoryUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import po.EmployeePo;
import vo.EmployeeRegistVo;

/**
 *
 * @author acer
 */
@Repository
public class EmployeeRegistDaoImpl implements EmployeeRegistDao {

    private SessionFactoryUtils util;
    
    public EmployeeRegistDaoImpl() {
        this.util = SessionFactoryUtils.getInstance();
    }
    
    public void registVo(EmployeeRegistVo employeeRegistVo) {
       EmployeePo po = new EmployeePo();
       po.setEmployeeName(employeeRegistVo.getName());
        Session session = this.util.getCurrentThreadSession();
       session.save(po);
       this.util.releaseCurrentSession();
    }

}
