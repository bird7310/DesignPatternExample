package com.ahacool.designpattern.mediator.test;

import com.ahacool.designpattern.mediator.Mediator;
import com.ahacool.designpattern.mediator.MyMediator;

/**
 * @ClassName MediatorTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public class MediatorTest {

	//类似外观模式，又一个类来管理调用其他类。
	public static void main(String[] args) {

		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.wordAll();

	}

}
