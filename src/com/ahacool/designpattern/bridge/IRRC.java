package com.ahacool.designpattern.bridge;

/**
 * @ClassName IRRC
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class IRRC extends AbstractRemoteConctol {
	public IRRC(ITV pTV) {
		super(pTV);
	}

	public void powerOn() {
		System.out.println("使用红外线遥控器");
		powerOnTV();
	}
}
