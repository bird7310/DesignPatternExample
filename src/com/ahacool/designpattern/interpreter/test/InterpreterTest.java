package com.ahacool.designpattern.interpreter.test;

import com.ahacool.designpattern.interpreter.Context;
import com.ahacool.designpattern.interpreter.Minus;
import com.ahacool.designpattern.interpreter.Plus;

/**
 * @ClassName InterpreterTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public class InterpreterTest {

	public static void main(String[] args) {
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}

}
