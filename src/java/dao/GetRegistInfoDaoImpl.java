/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;
import po.AgencyPo;

/**
 *
 * @author acer
 */
@Repository
public class GetRegistInfoDaoImpl implements GetRegistInfoDao{
    private List list;
    public List<AgencyPo> getAgencyList(){
        list = new LinkedList();
        return list;
    }
}
