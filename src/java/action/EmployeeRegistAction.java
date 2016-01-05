/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;
import service.EmployeeRegistServiceImpl;
import vo.EmployeeRegistVo;

/**
 *
 * @author acer
 */
@Controller
public class EmployeeRegistAction extends BaseAction{

    private EmployeeRegistServiceImpl employeeRegistServiceImpl;
    private EmployeeRegistVo employeeRegistVo;

    public EmployeeRegistServiceImpl getEmployeeRegistServiceImpl() {
        return employeeRegistServiceImpl;
    }

    public void setEmployeeRegistServiceImpl(EmployeeRegistServiceImpl employeeRegistServiceImpl) {
        this.employeeRegistServiceImpl = employeeRegistServiceImpl;
    }

    public EmployeeRegistVo getEmployeeRegistVo() {
        return employeeRegistVo;
    }

    public void setEmployeeRegistVo(EmployeeRegistVo employeeRegistVo) {
        this.employeeRegistVo = employeeRegistVo;
    }


        @Override
 @Action(value = "employeeRegisterAction", 
                results = { @Result(name = "SUCCESS", location = "/employeeRegistSuccess.html"),@Result(name = "FAILED", location = "/employeeRegistFailed.html") }
                )
    public String execute(){
        employeeRegistServiceImpl = new EmployeeRegistServiceImpl();
        //employeeRegistServiceImpl.getRegistInfoVo(employeeRegistVo);
        return "success";
        //缺failed
    }

}
