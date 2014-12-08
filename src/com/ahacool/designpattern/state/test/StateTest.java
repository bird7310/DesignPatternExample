package com.ahacool.designpattern.state.test;

import com.ahacool.designpattern.state.Context;
import com.ahacool.designpattern.state.State;

/**
 * @ClassName StateTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class StateTest {

	//改变不同的值，并且功能随之改变。
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		state.setmState(0);
		context.method();
		
		state.setmState(1);
		context.method();
	}
}
