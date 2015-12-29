package action;
import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;


import po.*;
import service.LoginService;
import service.LoginServiceImpl;

@Controller
	public class LoginAction extends BaseAction
	{  
		private UserPo m_user; 
                @Resource
		private LoginService m_loginService;

    @Action(value = "login", 
            results = { @Result(name = "SUCCESS", location = "index.html"),@Result(name = "ERROR", location = "userRegist.html") }
            )
		public String execute() 
		{
			try
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
			}catch(SQLException e)
			{
				System.out.println("SQL exception occurred while Loginning");
				return  "exception";  
			}
		}
	}

