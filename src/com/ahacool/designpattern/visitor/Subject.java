package com.ahacool.designpattern.visitor;

/**
 * @ClassName Subject
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public interface Subject {

	public void accept(Visitor pVisitor);

	public String getSubject();
}
