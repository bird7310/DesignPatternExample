package com.ahacool.designpattern.factorymethod.test;

import com.ahacool.designpattern.factorymethod.model.Car;
import com.ahacool.designpattern.factorymethod.simple.SimpleFactory;

/**
 * @ClassName SimpleFactoryTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-4-25
 * 
 */
public class SimpleFactoryTest {
	public static void main(String[] args){
		SimpleFactory simpleFactory = new SimpleFactory();
		Car car1 = simpleFactory.produceCar("red");
		car1.printColor();
		Car car2 = simpleFactory.produceCar("green");
		car2.printColor();
		// Compile error below, factory can not produce blue car.
		Car car3 = simpleFactory.produceCar("blue");
		car3.printColor();
	}
}
