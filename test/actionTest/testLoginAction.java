package actionTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import base.UnitTestBase;
import action.LoginAction;
import org.apache.struts2.ServletActionContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import vo.LoginVo;

/**
 *
 * @author acer
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class testLoginAction extends UnitTestBase{
    
    public testLoginAction() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void loginTest() {
//         MockHttpServletRequest request = new MockHttpServletRequest();
//         MockHttpServletResponse response = new MockHttpServletResponse();
         LoginAction loginAction = super.getBean("loginAction");
         LoginVo user1 = new LoginVo();
         user1.setUsername("davis");
         user1.setPassword("123");
         loginAction.setM_user(user1);
         System.out.println( user1.toString());
         assertTrue(loginAction.execute().equals("SUCCESS"));
         LoginVo user2 = new LoginVo();
         user2.setUsername("Colin");
         user2.setPassword("321");
         loginAction.setM_user(user2);
         assertTrue(loginAction.execute().equals("FAILED"));
     }
}
