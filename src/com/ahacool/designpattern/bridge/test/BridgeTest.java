package com.ahacool.designpattern.bridge.test;

import com.ahacool.designpattern.bridge.ITV;
import com.ahacool.designpattern.bridge.IRRC;
import com.ahacool.designpattern.bridge.SonyTV;
import com.ahacool.designpattern.bridge.BluetoothRC;
import com.ahacool.designpattern.bridge.SamSungTV;

/**
 * @ClassName BridgeTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class BridgeTest {
	public static void main(String[] args) {
		ITV samsumgTV = new SamSungTV();
		
		BluetoothRC bluetoothRC = new BluetoothRC(samsumgTV);
		bluetoothRC.powerOn();
		
		IRRC irRC = new IRRC(samsumgTV);
		irRC.powerOn();
	}
}
