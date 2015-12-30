package actionTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import base.UnitTestBase;
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

/**
 *
 * @author acer
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class EmployeeRegistTest extends UnitTestBase{
    
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


//     @Test
//     public void getJson() {
//         MockHttpServletRequest request = new MockHttpServletRequest();
//         String jsonStr;
//         JSONArray jsonArray = JSONArray.fromObject(jsonStr);
//         jsonArray.
//         for(int i=0;i<jsonArray.length(); i++){
//            JSONObject jsonJ = jsonArray.getJSONObject(i);
//            jsonJ.getInt("name");
//            jsonJ.getString("age");
//        }
////         request.setParameter("angency", jsonStr );
//         EmployeeRegistAction era = super.getBean("employeeRegistAction");
//         era.execute()
//         
//     }
}
