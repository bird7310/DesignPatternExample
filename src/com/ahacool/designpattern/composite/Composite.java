package com.ahacool.designpattern.composite;

import java.util.ArrayList;

/**
 * @ClassName Composite
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class Composite implements Component {

	private String mName;
	private ArrayList<Component> mList = new ArrayList<Component>();

	public Composite(String pName) {
		mName = pName;
	}

	public void add(Component pComponent) {
		mList.add(pComponent);
	}

	public void remove(Component pComponent) {
		mList.remove(pComponent);
	}

	@Override
	public void show() {
		System.out.println("我是" + mName);
		for (Component component : mList) {
			component.show();
		}
	}

}
