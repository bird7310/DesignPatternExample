package com.ahacool.designpattern.proxy;

/**
 * @ClassName Source
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
