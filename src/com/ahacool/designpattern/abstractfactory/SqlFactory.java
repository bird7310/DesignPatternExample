package com.ahacool.designpattern.abstractfactory;

import com.ahacool.designpattern.abstractfactory.dao.IDepartmentDAO;
import com.ahacool.designpattern.abstractfactory.dao.IUserDAO;
import com.ahacool.designpattern.abstractfactory.dao.SqlDepartmentDAO;
import com.ahacool.designpattern.abstractfactory.dao.SqlUserDAO;

/**
 * @ClassName SqlFactory
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class SqlFactory implements ICreateDataBaseFactory {

	@Override
	public IUserDAO createDatabaseUser() {
		return new SqlUserDAO();
	}

	@Override
	public IDepartmentDAO createDatabaseDepartment() {
		return new SqlDepartmentDAO();
	}

}
