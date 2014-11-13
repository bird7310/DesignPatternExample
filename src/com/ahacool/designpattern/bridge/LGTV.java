package com.ahacool.designpattern.bridge;

/**
 * @ClassName LGTV
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class LGTV implements ITV {

	@Override
	public void powerOn() {
		System.out.println("LG TV 已经启动。");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV 已经关闭。");
	}

}
