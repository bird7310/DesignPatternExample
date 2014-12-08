package com.ahacool.designpattern.interpreter;

/**
 * @ClassName Context
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public class Context {

	private int num1;
	private int num2;

	public Context(int pNum1, int pNum2) {
		num1 = pNum1;
		num2 = pNum2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	

}
