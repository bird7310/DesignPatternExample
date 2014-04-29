package com.ahacool.designpattern.factorymethod;

import com.ahacool.designpattern.factorymethod.model.Car;
import com.ahacool.designpattern.factorymethod.model.RedCar;

/**
 * @ClassName RedCarFactory
 * @author Moto
 * @date 2014 2014-4-29
 *
 */
public class RedCarFactory implements FactoryMethod{

	@Override
	public Car produceCar() {
		return new RedCar("red");
	}

}
