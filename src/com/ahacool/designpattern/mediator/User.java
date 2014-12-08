package com.ahacool.designpattern.mediator;

/**
 * @ClassName User
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-14
 * 
 */
public abstract class User {

	private Mediator mMediator;

	public User(Mediator pMediator) {
		mMediator = pMediator;
	}
	
	public abstract void work();

	public Mediator getmMediator() {
		return mMediator;
	}

	public void setmMediator(Mediator mMediator) {
		this.mMediator = mMediator;
	}

}
