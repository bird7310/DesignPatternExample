package com.ahacool.designpattern.prototype;

/**
 * @ClassName Score
 * @Description A object.
 * @author Moto
 * @date 2014 2014-9-9
 * 
 */
public class Score implements Prototype {

	public int mChinese;

	public Score() {
		mChinese = 100;
	}

	public Object clone() {
		Prototype prototype = new Score();
		return prototype;
	}

	public void changeScore(int pChinese, int pMath) {
		mChinese = pChinese;
	}

	public void printValue() {
		System.out.println("mChinese=" + mChinese );
	}

}
