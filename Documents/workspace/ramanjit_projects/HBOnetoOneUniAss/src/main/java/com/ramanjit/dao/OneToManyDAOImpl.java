package com.ramanjit.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ramanjit.domain.PhoneNumber;
import com.ramanjit.domain.User;
import com.ramanjit.util.HibernateUtil;

public class OneToManyDAOImpl implements OneToManyDAO {

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		//getSession
		Session ses = null;
		User user = null;
		PhoneNumber phone1 = null, phone2 = null;
		Set<PhoneNumber> set = null;
		Transaction tx  = null;
		ses = HibernateUtil.getSession();
		
		//Parent class Object
		user = new User();
		user.setUserId(100);
		user.setFirstName("Ramanjit");
		user.setLastName("Kaur");
		user.setAddrs("Punjab");
		
		//Child Object
		phone1 =  new PhoneNumber();
		phone1.setNumberType("resident");
		phone1.setPhone(1222);
		phone1.setProvider("Airt");
		
		
		
		phone2 =  new PhoneNumber();
		phone2.setNumberType("Office");
		phone2.setPhone(123222);
		phone2.setProvider("Vod");
		
		
		//add child to set collection
		set = new HashSet();
		set.add(phone1);
		set.add(phone2);
		user.setPhones(set);
		
		
		//Save
		try{
			tx = ses.beginTransaction();
			ses.save(user);
			tx.commit();
			System.out.println("Objects are saved");
		}catch(Exception e)
		{
			tx.rollback();
			System.out.println("Not saved");
		}
		
		

	}

}
