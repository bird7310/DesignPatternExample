package com.ahacool.designpattern.proxy;


/**
 * @ClassName Proxy
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Proxy implements Sourceable {

	private Source mSourse;

	public Proxy() {
		super();
		mSourse = new Source();
	}

	@Override
	public void method() {
		doBefore();
		mSourse.method();
		doAfter();
	}

	private void doBefore() {
		System.out.println("after proxy!");
	}

	private void doAfter() {
		System.out.println("after proxy!");
	}

}
