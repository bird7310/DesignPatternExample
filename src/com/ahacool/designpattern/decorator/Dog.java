package com.ahacool.designpattern.decorator;

/**
 * @ClassName Dog
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class Dog implements IAction {

	@Override
	public void eat() {
		System.out.println("吃：小狗吃骨头");
	}

	@Override
	public void run() {
		System.out.println("跑：慢跑");
	}

}
