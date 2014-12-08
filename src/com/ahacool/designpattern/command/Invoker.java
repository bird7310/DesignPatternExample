package com.ahacool.designpattern.command;

/**
 * @ClassName Invoker
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Invoker {

	private Command mCommand = null;

	public Invoker(Command command) {
		mCommand = command;
	}

	public void action() {
		mCommand.execute();
	}

}
