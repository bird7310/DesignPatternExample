package com.ahacool.designpattern.iterator;


/**
 * @ClassName Collection
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public interface Collection {

	public CharIterator iterator();

	public Object get(int pIndex);

	public int size();
}
