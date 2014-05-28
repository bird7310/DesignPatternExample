package com.ahacool.designpattern.singleton;

/**
 * @ClassName Singleton2
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-27
 * 
 */
public class Singleton2 {

	private static Singleton2 sInstance = null;

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		if (sInstance == null) {
			synchronized (Singleton2.class) {
				sInstance = new Singleton2();
			}
		}
		return sInstance;
	}
}