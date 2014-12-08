package com.ahacool.designpattern.chainofresponsibility;

/**
 * @ClassName Handler
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public abstract class Handler {

	protected Handler successor;

	public abstract void handleRequest();

	public Handler getsuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
