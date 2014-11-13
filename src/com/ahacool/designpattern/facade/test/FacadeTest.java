package com.ahacool.designpattern.facade.test;

import com.ahacool.designpattern.facade.Computer;

/**
 * @ClassName FacadeTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class FacadeTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startUp();
		computer.shutDown();
	}

}
