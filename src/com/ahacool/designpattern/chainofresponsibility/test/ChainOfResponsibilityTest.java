package com.ahacool.designpattern.chainofresponsibility.test;

import com.ahacool.designpattern.chainofresponsibility.ConcreteHandler;
import com.ahacool.designpattern.chainofresponsibility.Handler;

/**
 * @ClassName ChainOfResponsibilityTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class ChainOfResponsibilityTest {
	// 一个链上，时间从前往后传递。传递到对应的地方进行处理。
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		
		handler1.handleRequest();
	}
}
