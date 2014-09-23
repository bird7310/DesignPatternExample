package com.ahacool.designpattern.adapter;

/**
 * @ClassName RMBAdapee
 * @Description TODO
 * @author Moto
 * @date 2014 2014-6-6
 * 
 */
public class RMBAdapee {
	public void buyRiceInRMB(int pRMBValue) {
		int amount = pRMBValue / 2; // 购买的动作可以放到接口或者父类中。
		System.out.println("在中国，您用" + pRMBValue + "元人民币可以购买" + amount + "斤大米");
	}
}
