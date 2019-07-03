package com.ramanjit.test;

import com.ramanjit.dao.OneToManyDAO;
import com.ramanjit.dao.OneToManyDAOFactory;
import com.ramanjit.util.HibernateUtil;

public class OneToManyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneToManyDAO dao = null;
		
		dao = OneToManyDAOFactory.getInstance();
	
		dao.saveData();
		
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();
		
	}

}
