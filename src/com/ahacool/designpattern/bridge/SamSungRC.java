package com.ahacool.designpattern.bridge;

/**
 * @ClassName SamSungRC
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class SamSungRC extends AbstractRemoteConctol {

	public SamSungRC(ITV pTV) {
		super(pTV);
	}

	public void powerOn() {
		powerOnTV();
	}

}
