package com.ahacool.designpattern.abstractfactory;

import com.ahacool.designpattern.abstractfactory.dao.IDepartmentDAO;
import com.ahacool.designpattern.abstractfactory.dao.IUserDAO;
import com.ahacool.designpattern.abstractfactory.dao.MysqlDepartmentDAO;
import com.ahacool.designpattern.abstractfactory.dao.MysqlUserDAO;

/**
 * @ClassName MysqlFactory
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class MysqlFactory implements ICreateDataBaseFactory {

	@Override
	public IUserDAO createDatabaseUser() {
		return new MysqlUserDAO();
	}

	@Override
	public IDepartmentDAO createDatabaseDepartment() {
		return new MysqlDepartmentDAO();
	}

}
