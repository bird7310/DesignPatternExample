package com.ahacool.designpattern.decorator.test;

import com.ahacool.designpattern.decorator.BigDog;
import com.ahacool.designpattern.decorator.Dog;
import com.ahacool.designpattern.decorator.IAction;
import com.ahacool.designpattern.decorator.LittleDog;

/**
 * @ClassName DecoratorTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class DecoratorTest {
	// 方便的类的扩展，参考android源码中组件的继承
	public static void main(String[] args) {

		IAction dogAction = new Dog();

		IAction bigdogAction = new BigDog(dogAction);
		bigdogAction.eat();
		bigdogAction.run();
		
		System.out.println("---分割线---");
		
		IAction littledogAction = new LittleDog(dogAction);
		littledogAction.eat();
		littledogAction.run();

	}

}
