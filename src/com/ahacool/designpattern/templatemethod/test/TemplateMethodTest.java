package com.ahacool.designpattern.templatemethod.test;

import com.ahacool.designpattern.templatemethod.Account;
import com.ahacool.designpattern.templatemethod.CDAccount;
import com.ahacool.designpattern.templatemethod.MoneyMarketAccount;

/**
 * @ClassName TemplateMethodTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class TemplateMethodTest {

	public static void main(String[] args) {
		Account account = new MoneyMarketAccount();
		System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
		account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
	}
}
