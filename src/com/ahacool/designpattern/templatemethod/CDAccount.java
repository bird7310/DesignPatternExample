package com.ahacool.designpattern.templatemethod;

/**
 * @ClassName CDAccount
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class CDAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "CDAccount";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.6;
	}

}
