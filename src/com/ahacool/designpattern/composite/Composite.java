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
	private int mLevel;
	private ArrayList<Component> mList = new ArrayList<Component>();

	public Composite(String pName) {
		mName = pName;
		mLevel = 0;
	}

	public void add(Component pComponent) {
		pComponent.isChild(mLevel);
		mList.add(pComponent);
	}

	public void remove(Component pComponent) {
		mList.remove(pComponent);
	}

	@Override
	public void show() {
		showLevel();
		for (Component component : mList) {
			component.show();
		}
	}

	@Override
	public void isChild(int pFatherLevel) {
		mLevel = pFatherLevel + 1;
	}

	private void showLevel() {
		for (int i = 0; i < mLevel; i++) {
			System.out.print("-");
		}
		System.out.println(mName);
	}

}
