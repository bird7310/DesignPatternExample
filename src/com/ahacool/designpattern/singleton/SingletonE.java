package com.ahacool.designpattern.singleton;

/**
 * @ClassName SingletonLanHan
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-27
 * 
 */
public class SingletonE {

	private static final SingletonE sInstance = new SingletonE();

	private SingletonE() {
	}

	public static SingletonE getInstance() {
		return sInstance;
	}

	public Object readResolve() {
		return getInstance();
	}

	public void print() {
		System.out.println("饿汉式");
	}
}