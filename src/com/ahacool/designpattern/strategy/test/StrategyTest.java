package com.ahacool.designpattern.strategy.test;

import com.ahacool.designpattern.strategy.IPrice;
import com.ahacool.designpattern.strategy.NewMember;
import com.ahacool.designpattern.strategy.Price;
import com.ahacool.designpattern.strategy.VIPMember;

/**
 * @ClassName StrategyTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class StrategyTest {
	// 封装算法，客户端决定调用哪一个算法，通过传入值来确定。
	public static void main(String[] args) {
		double price = 100;

		IPrice newMember = new NewMember();
		Price newMemberPrice = new Price(newMember);
		double price1 = newMemberPrice.getPrice(price);
		System.out.println("最终价格为：" + price1);

		IPrice vipMember = new VIPMember();
		Price vipMemberPrice = new Price(vipMember);
		double price2 = vipMemberPrice.getPrice(price);
		System.out.println("最终价格为：" + price2);
	}

}
