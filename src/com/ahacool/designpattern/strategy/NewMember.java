package com.ahacool.designpattern.strategy;

/**
 * @ClassName NewMember
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class NewMember implements IPrice {

	@Override
	public double getPrice(double pPrice) {
		System.out.println("新用户没有折扣");
		return pPrice;
	}

}
