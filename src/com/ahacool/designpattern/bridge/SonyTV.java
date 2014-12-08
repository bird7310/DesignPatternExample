package com.ahacool.designpattern.bridge;

/**
 * @ClassName SonyTV
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class SonyTV implements ITV {
	@Override
	public void powerOn() {
		System.out.println("Sony TV 已经启动。");
	}
}
