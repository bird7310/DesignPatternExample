package com.ahacool.designpattern.bridge.test;

import com.ahacool.designpattern.bridge.ITV;
import com.ahacool.designpattern.bridge.LGRC;
import com.ahacool.designpattern.bridge.LGTV;
import com.ahacool.designpattern.bridge.SamSungRC;
import com.ahacool.designpattern.bridge.SamSungTV;

/**
 * @ClassName BridgeTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class BridgeTest {
	//不同的遥控器控制不同的电视

	public static void main(String[] args) {
		ITV samsumgTV = new SamSungTV();
		SamSungRC samsumgRC = new SamSungRC(samsumgTV);
		samsumgRC.powerOn();

		ITV lgTV = new LGTV();
		LGRC lgRC = new LGRC(lgTV);
		lgRC.powerOn();
	}

}
