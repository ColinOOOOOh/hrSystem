/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testDb;

import java.util.LinkedList;
import java.util.List;
import po.AgencyPo;

/**
 *
 * @author acer
 */
public class EmployeeRegistDb {
        private AgencyPo Agency010000;
        private AgencyPo Agency020000;
        private AgencyPo Agency000100;
        private AgencyPo Agency000200;
        private AgencyPo Agency000001;
        private AgencyPo Agency000002;
        private List<AgencyPo> AgencyList;
        
        
        public EmployeeRegistDb(){
            Agency010000 = new AgencyPo();
            Agency020000 = new AgencyPo();
            Agency000100 = new AgencyPo();
            Agency000200 = new AgencyPo();
            Agency000001 = new AgencyPo();
            Agency000002 = new AgencyPo();
            List AgencyChild010000 = new LinkedList();
            List AgencyChild000100 = new LinkedList();
            Agency010000.setAgencyId(01);
            Agency010000.setAgencyA(null);
            Agency010000.setAgencyB(AgencyChild010000);
            AgencyChild010000.add(Agency000100);
            Agency010000.setAgencyName("集团A");
            Agency000100.setAgencyId(01);
            Agency000100.setAgencyA(Agency010000);
            Agency000100.setAgencyName("软件公司A");
            Agency000100.setAgencyB(AgencyChild000100);
            AgencyChild000100.add(Agency000001);
            Agency000001.setAgencyId(01);
            Agency000001.setAgencyName("外包组A");
            Agency000001.setAgencyA(Agency000100);
            
            List AgencyChild020000 = new LinkedList();
            List AgencyChild000200 = new LinkedList();
            Agency020000.setAgencyId(02);
            Agency020000.setAgencyA(null);
            Agency020000.setAgencyB(AgencyChild020000);
            AgencyChild020000.add(Agency000200);
            Agency020000.setAgencyName("集团B");
            Agency000200.setAgencyId(02);
            Agency000200.setAgencyA(Agency020000);
            Agency000200.setAgencyName("软件公司B");
            Agency000200.setAgencyB(AgencyChild000200);
            AgencyChild000200.add(Agency000002);
            Agency000002.setAgencyId(02);
            Agency000002.setAgencyName("外包组B");
            Agency000002.setAgencyA(Agency000200);
            
            AgencyList = new LinkedList();
            AgencyList.add(Agency010000);
            AgencyList.add(Agency000100);
            AgencyList.add(Agency000001);
            AgencyList.add(Agency020000);
            AgencyList.add(Agency000200);
            AgencyList.add(Agency000002);
        }

    public List<AgencyPo> getAgencyList() {
        return AgencyList;
    }


        
}
