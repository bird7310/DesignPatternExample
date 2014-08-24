package com.ahacool.designpattern.singleton.test;

import com.ahacool.designpattern.singleton.SingletonE;
import com.ahacool.designpattern.singleton.SingletonL;

/**
 * @ClassName SingletonTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-15
 * 
 */
public class SingletonTest {
	public static void main(String[] args) {
		
		SingletonE singletonE = SingletonE.getInstance();
		singletonE.print();
		
		SingletonL singletonL = SingletonL.getInstance();
		singletonL.print();
	}
}
