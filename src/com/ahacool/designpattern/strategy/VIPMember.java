package com.ahacool.designpattern.strategy;

/**
 * @ClassName VIPMember
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class VIPMember implements IPrice {

	@Override
	public double getPrice(double pPrice) {
		System.out.println("VIP用户打8折");
		return 0.8 * pPrice;
	}

}
