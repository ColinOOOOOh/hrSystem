package action;
import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import po.*;
import service.LoginService;
import service.LoginServiceImpl;
import vo.LoginVo;

@Controller
	public class LoginAction extends BaseAction
	{  
                
		private LoginVo m_user; 

    public LoginVo getM_user() {
        return m_user;
    }

    public void setM_user(LoginVo m_user) {
        this.m_user = m_user;
    }
                @Autowired
		private LoginService m_loginService;

    @Action(value = "login", 
            results = { @Result(name = "SUCCESS", location = "index.html"),@Result(name = "FAILED", location = "userRegist.html") }
            )
		public String execute() 
		{
				m_loginService =new LoginServiceImpl();
				if (m_loginService.checkUserInfo(m_user).equals("SUCCESS")) 
				{
                                        setServletRequest(ServletActionContext.getRequest());
					  httpSession.setAttribute("u", m_user);
					return  "SUCCESS"; 
				}
				else
				{
					return "FAILED";
				}
		}
	}

