package com.ahacool.designpattern.command.test;

import com.ahacool.designpattern.command.Command;
import com.ahacool.designpattern.command.ConcreteCommand;
import com.ahacool.designpattern.command.Invoker;
import com.ahacool.designpattern.command.Receiver;

/**
 * @ClassName CommandTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class CommandTest {
	// invoker下命令，命令包含了接受者，接受者做动作.
	public static void main(String[] args) {
		Receiver recervier = new Receiver();
		Command command = new ConcreteCommand(recervier);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
