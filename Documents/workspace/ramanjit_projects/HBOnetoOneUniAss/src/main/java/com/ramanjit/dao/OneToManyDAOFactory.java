package com.ramanjit.dao;

public class OneToManyDAOFactory {
	public static OneToManyDAO getInstance(){
		return new OneToManyDAOImpl();
	}

}
