package com.ahacool.designpattern.templatemethod;

/**
 * @ClassName Account
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public abstract class Account {

	//不改变顶级逻辑，但是可以改变父类可变部分
	public final double calculateInterest() {
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount * interestRate;
	}

	protected abstract String doCalculateAccountType();

	protected abstract double doCalculateInterestRate();

	private double calculateAmount(String accountType) {
		return 100;
	}

}
