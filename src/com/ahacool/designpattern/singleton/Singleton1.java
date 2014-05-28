package com.ahacool.designpattern.singleton;

/**
 * @ClassName Singleton1
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-27
 * 
 */
public class Singleton1 {

	private static Singleton1 sInstance = null;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (sInstance == null) {
			sInstance = new Singleton1();
		}
		return sInstance;
	}
}