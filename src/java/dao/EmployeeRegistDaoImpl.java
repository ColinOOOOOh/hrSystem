/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import po.AgencyPo;
import testDb.EmployeeRegistDb;

/**
 *
 * @author acer
 */
@Repository
public class EmployeeRegistDaoImpl implements EmployeeRegistDao{
 
    private EmployeeRegistDb employeeRegistDb;
    

    @Override
    public List<AgencyPo> getAgencyList() {
        employeeRegistDb = new EmployeeRegistDb();
        return employeeRegistDb.getAgencyList();
//        if(level == 1){
//            for( int i = 0; i < agencyList.size(); i++ ){
//                if( agencyList.get(i).agencyId == agencyId && agencyList.get(i).getAgencyA() == null ){
//                        returnAgency = agencyList.get(i);
//                    break;
//                }
//            }
//        }else if(level == 2){
//            for( int i = 0; i < agencyList.size(); i++ ){
//                if( agencyList.get(i).agencyId == agencyId && agencyList.get(i).getAgencyA().getAgencyA() == null ){
//                        returnAgency = agencyList.get(i);
//                    break;
//                }
//            }
//        }
        
    }
        
        
}
