package com.ahacool.designpattern.bridge;

/**
 * @ClassName SamSungTV
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class SamSungTV implements ITV {

	@Override
	public void powerOn() {
		System.out.println("Samsung TV 已经启动。");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV 已经关闭。");
	}

}
