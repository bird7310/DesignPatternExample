package com.ahacool.designpattern.iterator;

/**
 * @ClassName MyCharIterator
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class MyCharIterator implements CharIterator {

	private Collection mCollection;
	private int mPosition = -1;

	public MyCharIterator(Collection pCollection) {
		mCollection = pCollection;
	}

	@Override
	public Object previous() {
		if (mPosition > 0) {
			mPosition--;
		}
		return mCollection.get(mPosition);
	}

	@Override
	public Object next() {
		if (mPosition < mCollection.size() - 1) {
			mPosition++;
		}
		return mCollection.get(mPosition);
	}

	@Override
	public boolean hasNext() {
		return (mPosition < mCollection.size() - 1);
	}

	@Override
	public Object first() {
		mPosition = 0;
		return mCollection.get(mPosition);
	}

}
