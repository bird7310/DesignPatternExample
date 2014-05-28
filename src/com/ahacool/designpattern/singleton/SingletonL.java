package com.ahacool.designpattern.singleton;

/**
 * @ClassName SingletonLanHan
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-27
 * 
 */
public class SingletonL {

	private static SingletonL sInstance = null;

	private SingletonL() {
	}

	public static SingletonL getInstance() {
		if (sInstance == null) {
			synchronized (SingletonL.class) {
				if (sInstance == null) {
					sInstance = new SingletonL();
				}
			}
		}
		return sInstance;
	}

	public Object readResolve() {
		return getInstance();
	}
}