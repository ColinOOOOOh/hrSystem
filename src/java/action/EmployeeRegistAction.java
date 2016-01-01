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
import service.EmployeeRegisterServiceImpl;

/**
 *
 * @author acer
 */
@Controller
public class EmployeeRegistAction extends BaseAction{
    private List<AgencyPo> agencyList;
    private JSONObject agencyJSON;
    private JSONArray lv1_agencyArray;
    private JSONArray lv2_agencyArray;
    private JSONArray lv3_agencyArray;
    private EmployeeRegisterServiceImpl employeeRegistServiceImpl;

    public JSONArray getLv1_agencyArray() {
        return lv1_agencyArray;
    }

    public void setLv1_agencyArray(JSONArray lv1_agencyArray) {
        this.lv1_agencyArray = lv1_agencyArray;
    }
    
    
    @Override
                    @Action(value = "employeeRegisterAction", 
                results = { @Result(name = "SUCCESS", location = "/index.html"),@Result(name = "FAILED", location = "/userRegist.html") }
                )
    public String execute(){
        agencyList = employeeRegistServiceImpl.getAgencyList();
        lv1_agencyArray = new JSONArray();

        for(Iterator<AgencyPo> i = agencyList.iterator(); i.hasNext();){
                AgencyPo a1 = i.next();
            if( a1.getAgencyA() == null){
                agencyJSON = new JSONObject();
                agencyJSON.put("name", a1.getAgencyName());
                agencyJSON.put("id", a1.getAgencyId());
                lv1_agencyArray.add(agencyJSON);
                //lv2
                lv2_agencyArray = new JSONArray();
                Collection<AgencyPo> lv2_collection =  a1.getAgencyB();
                for(Iterator<AgencyPo> l = lv2_collection.iterator(); l.hasNext();){
                    agencyJSON = new JSONObject();
                    AgencyPo a2 = l.next();
                    agencyJSON.put("name", a2.getAgencyName());
                    agencyJSON.put("id", a2.getAgencyId());
                    lv2_agencyArray.add(agencyJSON);
                    //lv3
                    lv3_agencyArray = new JSONArray();
                    Collection<AgencyPo> lv3_collection =  a2.getAgencyB();
                    for(Iterator<AgencyPo> j = lv3_collection.iterator(); j.hasNext();){
                        agencyJSON = new JSONObject();
                        AgencyPo a3 = j.next();
                        agencyJSON.put("name", a3.getAgencyName());
                        agencyJSON.put("id", a3.getAgencyId());
                        lv3_agencyArray.add(agencyJSON);
                    }
                }
                
            }
        }
  
        return "SUCCESS";
    }
}
