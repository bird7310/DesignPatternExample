package com.ahacool.designpattern.bridge;

/**
 * @ClassName BluetoothRC
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class BluetoothRC extends AbstractRemoteConctol {
	public BluetoothRC(ITV pTV) {
		super(pTV);
	}

	public void powerOn() {
		System.out.println("使用蓝牙遥控器");
		powerOnTV();
	}
}
