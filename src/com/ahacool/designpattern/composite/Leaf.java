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
	private int mLevel;

	public Leaf(String pName) {
		mName = pName;
		mLevel = 0;
	}

	@Override
	public void show() {
		showLevel();
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
