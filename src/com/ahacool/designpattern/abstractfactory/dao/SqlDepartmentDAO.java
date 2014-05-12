package com.ahacool.designpattern.abstractfactory.dao;

/**
 * @ClassName SqlDepartmentDAO
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class SqlDepartmentDAO implements IDepartmentDAO {

	@Override
	public void insert() {
		System.out.println("Sql insert data to department");
	}

	@Override
	public void getDepartmentName() {
		System.out.println("Sql get data from department");
	}

}
