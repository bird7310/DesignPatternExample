package com.ahacool.designpattern.prototype;

/**
 * @ClassName Person
 * @Description It can only clone value.
 * @author Moto
 * @date 2014 2014-9-6
 * 
 */
public class Person implements Prototype {

	public String mName;
	public String mMajor;
	public Score mScore;

	public Person(Score pScore) {
		mName = "张三";
		mMajor = "IT";
		mScore = pScore;
	}

	public Object clone() {
		Prototype Prototype = new Person(mScore);
		return Prototype;
	}

	public void printValue(String pName) {
		System.out.println(pName+":");
		System.out.println("id=" + this + "  mName=" + mName + "  mMajor=" + mMajor);
		System.out.println("mScore=" + mScore + "  mChinese=" + mScore.mChinese);
	}

}
