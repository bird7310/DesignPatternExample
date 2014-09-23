package com.ahacool.designpattern.adapter;

/**
 * @ClassName DollarAdapter
 * @Description TODO
 * @author Moto
 * @date 2014 2014-9-16
 * 
 */
public class DollarAdapter implements ActionTarget {

	private RMBAdapee mRMBAdapee;

	public DollarAdapter(RMBAdapee pRMBAdapee) {
		mRMBAdapee = pRMBAdapee;
	}

	public void buyRiceInDollars(int pValue) {
		int amount = pValue / 1;	//购买的动作可以放到接口或者父类中。
		System.out.println("在美国，您用" + pValue + "美元可以购买" + amount + "斤大米");
	}

	@Override
	public void buyRiceInRMB(int pValue) {
		int rmbValue = pValue * 6;
		System.out.println(pValue + "美元可以兑换" + rmbValue + "元人民币");
		mRMBAdapee.buyRiceInRMB(rmbValue);
	}

}
