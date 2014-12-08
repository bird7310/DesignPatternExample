package com.ahacool.designpattern.state;

/**
 * @ClassName Context
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Context {

	private State mState;

	public Context(State pState) {
		mState = pState;
	}

	public void method() {
		if (0 == mState.getmState()) {
			mState.method1();
		} else if (1 == mState.getmState()) {
			mState.method2();
		}
	}

	public State getmState() {
		return mState;
	}

	public void setmState(State mState) {
		this.mState = mState;
	}

}
