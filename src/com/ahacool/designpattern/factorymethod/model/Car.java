package com.ahacool.designpattern.factorymethod.model;

/**
 * @ClassName Car
 * @author Moto
 * @date 2014 2014-4-29
 * 
 */
public class Car {
	private String mColor;

	public Car(String pColor) {
		mColor = pColor;
	}

	public void printColor() {
		System.out.println("My color is " + mColor);
	}
}
