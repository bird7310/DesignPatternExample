package com.ahacool.designpattern.memento;

/**
 * @ClassName Storage
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class Storage {

	private Memento mMemento;

	public Storage(Memento pMemento) {
		mMemento = pMemento;
	}

	public Memento getmMemento() {
		return mMemento;
	}

	public void setmMemento(Memento mMemento) {
		this.mMemento = mMemento;
	}

}
