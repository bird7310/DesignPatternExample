package com.ahacool.designpattern.composite;

/**
 * @ClassName Leaf
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class Leaf implements Component {

	private String mName;

	public Leaf(String pName) {
		mName = pName;
	}

	@Override
	public void show() {
		System.out.println("我是" + mName);
	}

}
