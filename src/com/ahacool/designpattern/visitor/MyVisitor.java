package com.ahacool.designpattern.visitor;


/**
 * @ClassName MyVisitor
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject pSubject) {
		System.out.println("visit the subject：" + pSubject.getSubject());
	}

}
