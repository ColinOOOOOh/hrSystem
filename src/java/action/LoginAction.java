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
                
		private LoginVo user; 

                public LoginVo getUser() {
                    System.out.println("get user");
                    return user;
                }

                public void setUser(LoginVo m_user) {
                    System.out.println("set user");
                    this.user = m_user;
                }
                @Autowired
		private LoginService m_loginService;

                @Action(value = "loginAction", 
                results = { @Result(name = "SUCCESS", location = "/index.html"),@Result(name = "FAILED", location = "/userRegist.html") }
                )
                
                @Override
		public String execute() 
		{
				m_loginService =new LoginServiceImpl();
				if (m_loginService.checkUserInfo(user).equals("SUCCESS")) 
				{
                                        setServletRequest(ServletActionContext.getRequest());
					  httpSession.setAttribute("u", user);
					return  "SUCCESS"; 
				}
				else
				{
					return "FAILED";
				}
		}
	}

