package com.ahacool.designpattern.templatemethod;

/**
 * @ClassName MoneyMarketAccount
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MoneyMarketAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "MoneyMarketAccount";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.045;
	}

}
