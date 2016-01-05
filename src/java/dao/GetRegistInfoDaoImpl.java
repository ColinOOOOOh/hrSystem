/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import po.AgencyPo;
@Repository
public class GetRegistInfoDaoImpl {

	private SessionFactoryUtils util;

	public GetRegistInfoDaoImpl() {
		this.util = SessionFactoryUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<AgencyPo> getAgencyList() {
		Session session = this.util.getCurrentThreadSession();
		Query query = session.createQuery("from AgencyPo");

		return query.list();
	}

}
