package com.ahacool.designpattern.observer;

import java.util.ArrayList;

/**
 * @ClassName FrontDeskStaff
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class FrontDeskStaff implements Client {

	private ArrayList<Observer> mStafflist;

	public FrontDeskStaff() {
		mStafflist = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer pObserver) {
		mStafflist.add(pObserver);
	}

	@Override
	public void remove(Observer pObserver) {
		mStafflist.remove(pObserver);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : mStafflist) {
			observer.inform(this);
		}
	}

}
