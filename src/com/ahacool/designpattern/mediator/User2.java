package com.ahacool.designpattern.mediator;

/**
 * @ClassName User2
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public class User2 extends User {

	public User2(Mediator pMediator) {
		super(pMediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");
	}

}
