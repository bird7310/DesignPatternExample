package com.ahacool.designpattern.abstractfactory.dao;

/**
 * @ClassName MysqlUserDAO
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class MysqlUserDAO implements IUserDAO {

	@Override
	public void insert() {
		System.out.println("Mysql insert data to user");
	}

	@Override
	public void getUserName() {
		System.out.println("Mysql get data from user");
	}

}
