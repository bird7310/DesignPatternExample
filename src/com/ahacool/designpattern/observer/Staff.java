package com.ahacool.designpattern.observer;

/**
 * @ClassName Staff
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class Staff implements Observer {

	private String mName;

	public Staff(String pName) {
		mName = pName;
	}

	@Override
	public void inform(Client client) {
		System.out.println(mName + " 获得通知");
	}

}
