package com.ramanjit.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	private static Session ses = null;
	static{
		factory = new Configuration().configure("/com/ramanjit/cfg/hibernate.cfg.xml").buildSessionFactory();
	}
	public static Session getSession()
	{
		ses = factory.openSession();
		return ses;
	}
	public static void closeSession()
	{
		ses.close();
	}
	public static void closeSessionFactory()
	{
		factory.close();
	}
}
