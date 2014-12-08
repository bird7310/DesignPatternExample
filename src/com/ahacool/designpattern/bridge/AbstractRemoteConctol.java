package com.ahacool.designpattern.bridge;

/**
 * @ClassName AbstractRemoteConctol
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public abstract class AbstractRemoteConctol {
	private ITV mTV;

	public AbstractRemoteConctol(ITV pTV) {
		mTV = pTV;
	}

	public void powerOnTV() {
		mTV.powerOn();
	}
}
