package com.ahacool.designpattern.factorymethod.test;

import com.ahacool.designpattern.factorymethod.FactoryMethod;
import com.ahacool.designpattern.factorymethod.GreenCarFactory;
import com.ahacool.designpattern.factorymethod.RedCarFactory;
import com.ahacool.designpattern.factorymethod.model.Car;

/**
 * @ClassName FactoryMethodTest
 * @author Moto
 * @date 2014 2014-4-25
 * 
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		FactoryMethod redCarFactory = new RedCarFactory();
		Car ca1 = redCarFactory.produceCar();
		ca1.printColor();

		FactoryMethod greenFactory = new GreenCarFactory();
		Car car2 = greenFactory.produceCar();
		car2.printColor();
	}
}
