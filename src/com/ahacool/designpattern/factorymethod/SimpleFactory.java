package com.ahacool.designpattern.factorymethod;

import com.ahacool.designpattern.factorymethod.model.Car;
import com.ahacool.designpattern.factorymethod.model.GreenCar;
import com.ahacool.designpattern.factorymethod.model.RedCar;

/**
 * @ClassName SimpleFactory
 * @author Moto
 * @date 2014 2014-4-25
 * 
 */
public class SimpleFactory {
	private static final String RED = "red";
	private static final String GREEN = "green";

	public Car produceCar(String pColor) {
		if (RED.equals(pColor)) {
			return new RedCar(pColor);
		} else if (GREEN.equals(pColor)) {
			return new GreenCar(pColor);
		} else {
			System.out.println("Please input correct color.");
			return null;
		}
	}
}
