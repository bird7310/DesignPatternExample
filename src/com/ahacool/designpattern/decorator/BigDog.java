package com.ahacool.designpattern.decorator;

/**
 * @ClassName BigDog
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class BigDog implements IAction {

	private IAction mAction;

	public BigDog(IAction pAction) {
		mAction = pAction;
	}

	@Override
	public void eat() {
		mAction.eat();
	}

	@Override
	public void run() {
		mAction.run();
		System.out.println("跑：快跑");
	}

}
