package com.ahacool.designpattern.mediator;
/**
 * @ClassName User1
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public class User1 extends User{

	public User1(Mediator pMediator) {
		super(pMediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");  
	}

}
