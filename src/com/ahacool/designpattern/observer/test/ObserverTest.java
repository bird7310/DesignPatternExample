package com.ahacool.designpattern.observer.test;

import com.ahacool.designpattern.observer.FrontDeskStaff;
import com.ahacool.designpattern.observer.Staff;

/**
 * @ClassName ObserverTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class ObserverTest {
	// 同事们接收前台的通知

	public static void main(String[] args) {
		FrontDeskStaff frontDeskStaff = new FrontDeskStaff();
		Staff staff1 = new Staff("Mike");
		Staff staff2 = new Staff("Joe");
		Staff staff3 = new Staff("Ire");
		frontDeskStaff.register(staff1);
		frontDeskStaff.register(staff2);
		frontDeskStaff.register(staff3);
		frontDeskStaff.notifyObserver();
	}

}
