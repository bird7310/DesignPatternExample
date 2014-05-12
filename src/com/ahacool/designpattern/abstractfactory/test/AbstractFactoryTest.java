package com.ahacool.designpattern.abstractfactory.test;

import com.ahacool.designpattern.abstractfactory.ICreateDataBaseFactory;
import com.ahacool.designpattern.abstractfactory.MysqlFactory;
import com.ahacool.designpattern.abstractfactory.SqlFactory;
import com.ahacool.designpattern.abstractfactory.dao.IUserDAO;

/**
 * @ClassName AbstractFactoryTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
//		ICreateDataBaseFactory factory = new SqlFactory();
		ICreateDataBaseFactory factory = new MysqlFactory();

		IUserDAO userDAO = factory.createDatabaseUser();
		userDAO.insert();
		userDAO.getUserName();
	}
}
