package com.ahacool.designpattern.memento.test;

import com.ahacool.designpattern.memento.Original;
import com.ahacool.designpattern.memento.Storage;

/**
 * @ClassName MementoTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MementoTest {

	// 保存类的部分属性
	public static void main(String[] args) {

		Original original = new Original("egg");
		Storage storage = new Storage(original.createMemento());
		System.out.println("初始化状态为：" + original.getmValue());
		original.setmValue("niu");
		System.out.println("修改后状态为：" + original.getmValue());

		original.restoreMemento(storage.getmMemento());
		System.out.println("恢复后状态为：" + original.getmValue());
	}

}
