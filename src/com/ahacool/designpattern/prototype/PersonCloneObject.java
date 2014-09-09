package com.ahacool.designpattern.prototype;

/**
 * @ClassName PersonCloneObject
 * @Description It can clone the object, deep clone.
 * @author Moto
 * @date 2014 2014-9-6
 * 
 */
public class PersonCloneObject implements Prototype {

	public String mName;
	public String mMajor;
	public Score mScore;

	public PersonCloneObject(Score pScore) {
		mName = "张三";
		mMajor = "IT";
		mScore = (Score) pScore.clone();
	}

	public Object clone() {
		Prototype prototype = new PersonCloneObject(mScore);
		return prototype;
	}

	public void printValue(String pName) {
		System.out.println(pName + ":");
		System.out.println("id=" + this + "  mName=" + mName + "  mMajor=" + mMajor);
		System.out.println("mScore=" + mScore + "  mChinese=" + mScore.mChinese);
	}

}
