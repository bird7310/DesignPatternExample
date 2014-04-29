package com.ahacool.designpattern.factorymethod;

import com.ahacool.designpattern.factorymethod.model.Car;
import com.ahacool.designpattern.factorymethod.model.GreenCar;

/**
 * @ClassName GreenCarFactory
 * @author Moto
 * @date 2014 2014-4-29
 * 
 */
public class GreenCarFactory implements FactoryMethod {

	@Override
	public Car produceCar() {
		return new GreenCar("green");
	}
	
}
