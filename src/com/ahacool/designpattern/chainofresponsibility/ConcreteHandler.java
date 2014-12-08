package com.ahacool.designpattern.chainofresponsibility;

/**
 * @ClassName ConcreteHandler
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		if (getsuccessor() != null) {
			System.out.println("放过请求");
			getsuccessor().handleRequest();
		} else {
			System.out.println("处理请求");
		}
	}
}
