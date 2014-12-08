package com.ahacool.designpattern.interpreter;

/**
 * @ClassName Minus
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public class Minus implements Expression {

	@Override
	public int interpret(Context pContext) {
		return pContext.getNum1() - pContext.getNum2();
	}

}
