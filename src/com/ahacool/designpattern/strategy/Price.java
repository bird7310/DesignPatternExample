package com.ahacool.designpattern.strategy;

/**
 * @ClassName Price
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Price {

	private IPrice mPrice;

	public Price(IPrice pPrice) {
		mPrice = pPrice;
	}

	public double getPrice(double pPrice) {
		return mPrice.getPrice(pPrice);
	}

}
