package com.ahacool.designpattern.bridge;

/**
 * @ClassName LGRC
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class LGRC extends AbstractRemoteConctol {

	public LGRC(ITV pTV) {
		super(pTV);
	}

	public void powerOn() {
		powerOnTV();
	}

}
