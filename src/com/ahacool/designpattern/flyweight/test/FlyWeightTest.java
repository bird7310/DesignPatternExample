package com.ahacool.designpattern.flyweight.test;

import com.ahacool.designpattern.flyweight.FlyWeight;
import com.ahacool.designpattern.flyweight.FlyWeightFactory;

/**
 * @ClassName FlyWeightTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class FlyWeightTest {
	// 类似连接池，用一个数据结构保存已经存在的连接。
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight fly = factory.factory(new Character('a'));
		fly.operation("第一次");

		fly = factory.factory(new Character('b'));
		fly.operation("第二次");

		fly = factory.factory(new Character('a'));
		fly.operation("第三次");
	}

}
