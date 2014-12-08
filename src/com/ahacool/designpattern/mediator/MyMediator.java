package com.ahacool.designpattern.mediator;

/**
 * @ClassName MyMediator
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MyMediator implements Mediator {

	private User user1;
	private User user2;

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void wordAll() {
		user1.work();
		user2.work();

	}
}
