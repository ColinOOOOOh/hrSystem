package action;
import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.opensymphony.xwork2.ActionSupport;
import javax.annotation.Resource;
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
					return "ERROR";
				}
			}catch(SQLException e)
			{
				System.out.println("SQL exception occurred while Loginning");
				return  "exception";  
			}
		}
	}

