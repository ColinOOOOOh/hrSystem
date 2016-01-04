package actionTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import action.EmployeeRegistAction;
import base.UnitTestBase;
import java.util.LinkedList;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import po.AgencyPo;

/**
 *
 * @author acer
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class EmployeeRegistTest extends UnitTestBase{
        private AgencyPo Agency010000;
        private AgencyPo Agency020000;
        private AgencyPo Agency000100;
        private AgencyPo Agency000200;
        private AgencyPo Agency000001;
        private AgencyPo Agency000002;
    
    public EmployeeRegistTest() {
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
     public void getJsonTest() {
//         MockHttpServletRequest request = new MockHttpServletRequest();

//         EmployeeRegistAction era = super.getBean("employeeRegistAction");
//         System.out.println(era.execute());
//         System.out.println(era.getJsonStr());

     }
}
