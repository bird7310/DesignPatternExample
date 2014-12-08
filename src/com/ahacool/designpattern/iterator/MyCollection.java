package com.ahacool.designpattern.iterator;

/**
 * @ClassName MyCollection
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MyCollection implements Collection {

	public String string[] = {
			"A", "B", "C", "D", "E" };

	@Override
	public CharIterator iterator() {
		return new MyCharIterator(this);
	}

	@Override
	public Object get(int pIndex) {
		return string[pIndex];
	}

	@Override
	public int size() {
		return string.length;
	}

}
