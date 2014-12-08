package com.ahacool.designpattern.iterator.test;

import com.ahacool.designpattern.iterator.CharIterator;
import com.ahacool.designpattern.iterator.Collection;
import com.ahacool.designpattern.iterator.MyCollection;

/**
 * @ClassName IteratorTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class IteratorTest {

	// 参考我们使用的Iterator.
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		CharIterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
