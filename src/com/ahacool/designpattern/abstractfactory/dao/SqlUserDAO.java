package com.ahacool.designpattern.abstractfactory.dao;

/**
 * @ClassName SqlUserDAO
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class SqlUserDAO implements IUserDAO {

	@Override
	public void insert() {
		System.out.println("Sql insert data to user");
	}

	@Override
	public void getUserName() {
		System.out.println("Sql get data from user");
	}

}
