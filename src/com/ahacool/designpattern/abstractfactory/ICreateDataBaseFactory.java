package com.ahacool.designpattern.abstractfactory;

import com.ahacool.designpattern.abstractfactory.dao.IDepartmentDAO;
import com.ahacool.designpattern.abstractfactory.dao.IUserDAO;

/**
 * @ClassName ICreateDataBaseFactory
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public interface ICreateDataBaseFactory {
	IUserDAO createDatabaseUser();

	IDepartmentDAO createDatabaseDepartment();
}
