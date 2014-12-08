package com.ahacool.designpattern.memento;

/**
 * @ClassName Original
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Original {

	private String mValue;

	public Original(String pValue) {
		mValue = pValue;
	}

	public Memento createMemento() {
		return new Memento(mValue);
	}

	public void restoreMemento(Memento pMemento) {
		mValue = pMemento.getmValue();
	}

	public String getmValue() {
		return mValue;
	}

	public void setmValue(String mValue) {
		this.mValue = mValue;
	}

}
