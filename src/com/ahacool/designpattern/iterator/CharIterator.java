package com.ahacool.designpattern.iterator;

/**
 * @ClassName CharIterator
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public interface CharIterator {

	public Object previous();

	public Object next();

	public boolean hasNext();

	public Object first();

}
