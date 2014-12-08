package com.ahacool.designpattern.memento;

/**
 * @ClassName Memento
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Memento {

	private String mValue;

	public Memento(String pValue) {
		mValue = pValue;
	}

	public String getmValue() {
		return mValue;
	}

	public void setmValue(String mValue) {
		this.mValue = mValue;
	}

}
