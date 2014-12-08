package com.ahacool.designpattern.visitor.test;

import com.ahacool.designpattern.visitor.MySubject;
import com.ahacool.designpattern.visitor.MyVisitor;
import com.ahacool.designpattern.visitor.Subject;
import com.ahacool.designpattern.visitor.Visitor;

/**
 * @ClassName VisitorTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class VisitorTest {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}

}
