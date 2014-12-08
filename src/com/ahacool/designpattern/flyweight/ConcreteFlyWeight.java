package com.ahacool.designpattern.flyweight;

/**
 * @ClassName Character
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class ConcreteFlyWeight implements FlyWeight {

	private Character intrinsicState = null;

	public ConcreteFlyWeight(Character state) {
		intrinsicState = state;
	}

	@Override
	public void operation(String state) {
		System.out.println(state+" "+this.intrinsicState);
	}

}
