package com.ahacool.designpattern.abstractfactory.dao;

/**
 * @ClassName MysqlDepartmentDAO
 * @author Moto
 * @date 2014 2014-5-8
 * 
 */
public class MysqlDepartmentDAO implements IDepartmentDAO {

	@Override
	public void insert() {
		System.out.println("Mysql insert data to department");
	}

	@Override
	public void getDepartmentName() {
		System.out.println("Mysql get data from department");
	}

}
