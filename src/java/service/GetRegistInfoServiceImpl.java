/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.EmployeeRegistDaoImpl;
import dao.GetRegistInfoDaoImpl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import po.AgencyPo;

/**
 *
 * @author acer
 */
@Service
public class GetRegistInfoServiceImpl implements GetRegistInfoService{
    @Resource
    private GetRegistInfoDaoImpl getRegistInfoDaoImpl;
    @Override
    public List<AgencyPo> getAgencyList (){
        getRegistInfoDaoImpl = new GetRegistInfoDaoImpl();
        return getRegistInfoDaoImpl.getAgencyList();
    }
}
