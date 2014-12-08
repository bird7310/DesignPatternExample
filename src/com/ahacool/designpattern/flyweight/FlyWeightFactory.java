package com.ahacool.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FlyWeightFactory
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-13
 * 
 */
public class FlyWeightFactory {

	private Map<Character, FlyWeight> files = new HashMap<Character, FlyWeight>();

	public FlyWeight factory(Character state) {
		FlyWeight flyweight = files.get(state);
		if (flyweight == null) {
			flyweight = new ConcreteFlyWeight(state);
			files.put(state, flyweight);
		}
		return flyweight;
	}

}
