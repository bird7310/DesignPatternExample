package com.ahacool.designpattern.adapter.test;

import com.ahacool.designpattern.adapter.DollarAdapter;
import com.ahacool.designpattern.adapter.RMBAdapee;

/**
 * @ClassName AdapterTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-6-6
 * 
 */
public class AdapterTest {
	public static void main(String[] args) {
		int dollar = 10;
		DollarAdapter adapter = new DollarAdapter(new RMBAdapee());
		adapter.buyRiceInDollars(dollar);
		adapter.buyRiceInRMB(dollar);
	}
}
