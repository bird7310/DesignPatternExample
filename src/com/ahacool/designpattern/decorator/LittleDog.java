package com.ahacool.designpattern.decorator;

/**
 * @ClassName LittleDog
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class LittleDog implements IAction {
	private IAction mAction;

	public LittleDog(IAction pAction) {
		mAction = pAction;
	}

	@Override
	public void eat() {
		System.out.println("吃：不能吃骨头");
	}

	@Override
	public void run() {
		mAction.run();
	}
}
