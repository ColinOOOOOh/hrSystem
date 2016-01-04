/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;
import po.AgencyPo;
import service.GetRegistInfoServiceImpl;
import vo.EmployeeRegistVo;

/**
 *
 * @author acer
 */
@Controller
public class GetRegistInfoAction extends BaseAction{
    private EmployeeRegistVo employeeRegistVo;
    private List<AgencyPo> agencyList;
    private JSONObject lv1_agencyJSON;
    private JSONObject lv2_agencyJSON;
    private JSONObject lv3_agencyJSON;
    private JSONArray lv1_agencyArray;
    private JSONArray lv2_agencyArray;
    private JSONArray lv3_agencyArray;
    private GetRegistInfoServiceImpl getRegistInfoServiceImpl;
    private String jsonStr;
    
        public EmployeeRegistVo getEmployeeRegistVo() {
        return employeeRegistVo;
    }

    public void setEmployeeRegistVo(EmployeeRegistVo employeeRegistVo) {
        this.employeeRegistVo = employeeRegistVo;
    }


    public String getJsonStr() {
        return jsonStr;
    }

    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }
        @Override
                    @Action(value = "GetRegistInfoAction", 
                results = { @Result(name = "SUCCESS", location = "/employeeRegist.jsp"),@Result(name = "FAILED", location = "/getRegistInfoError.jsp") }
                )
    public String execute(){
        getRegistInfoServiceImpl = new GetRegistInfoServiceImpl();
        agencyList = getRegistInfoServiceImpl.getAgencyList();
        
        
        lv1_agencyArray = new JSONArray();
        for(Iterator<AgencyPo> i = agencyList.iterator(); i.hasNext();){
                AgencyPo a1 = i.next();
            if( a1.getAgencyA() == null){
                lv1_agencyJSON = new JSONObject();
                lv1_agencyJSON.put("name", a1.getAgencyName());
                lv1_agencyJSON.put("id", a1.getAgencyId());
                
                //lv2
                lv2_agencyArray = new JSONArray();
                Collection<AgencyPo> lv2_collection =  a1.getAgencyB();
                for(Iterator<AgencyPo> l = lv2_collection.iterator(); l.hasNext();){
                    lv2_agencyJSON = new JSONObject();
                    AgencyPo a2 = l.next();
                    lv2_agencyJSON.put("name", a2.getAgencyName());
                    lv2_agencyJSON.put("id", a2.getAgencyId());
                    
                    //lv3
                    lv3_agencyArray = new JSONArray();
                    Collection<AgencyPo> lv3_collection =  a2.getAgencyB();
                    for(Iterator<AgencyPo> j = lv3_collection.iterator(); j.hasNext();){
                        lv3_agencyJSON = new JSONObject();
                        AgencyPo a3 = j.next();
                        lv3_agencyJSON.put("name", a3.getAgencyName());
                        lv3_agencyJSON.put("id", a3.getAgencyId());
                        lv3_agencyArray.add(lv3_agencyJSON);
                    }
                    lv2_agencyJSON.put("value", lv3_agencyArray);
                    lv2_agencyArray.add(lv2_agencyJSON);
                }
                lv1_agencyJSON.put("value", lv2_agencyArray);
                lv1_agencyArray.add(lv1_agencyJSON);
            }
        }
        jsonStr = lv1_agencyArray.toString();
        return "SUCCESS";
        //差fail
    }
}
