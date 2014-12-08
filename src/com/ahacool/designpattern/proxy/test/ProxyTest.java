package com.ahacool.designpattern.proxy.test;

import com.ahacool.designpattern.proxy.Proxy;
import com.ahacool.designpattern.proxy.Sourceable;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class ProxyTest {
	// 类似装饰模式
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
