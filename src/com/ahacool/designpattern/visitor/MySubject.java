package com.ahacool.designpattern.visitor;

/**
 * @ClassName MySubject
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
