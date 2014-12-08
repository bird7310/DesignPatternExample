package com.ahacool.designpattern.command;

/**
 * @ClassName ConcreteCommand
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class ConcreteCommand implements Command {

	private Receiver mReceiver = null;

	public ConcreteCommand(Receiver pReceiver) {
		mReceiver = pReceiver;
	}

	@Override
	public void execute() {
		mReceiver.action();
	}

}
