package com.ahacool.designpattern.singleton;

/**
 * @ClassName Singleton3
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-27
 * 
 */
public class Singleton3 {

	private static Singleton3 sInstance = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (sInstance == null) {
			synchronized (Singleton3.class) {
				if (sInstance == null) {
					sInstance = new Singleton3();
				}
			}
		}
		return sInstance;
	}
}