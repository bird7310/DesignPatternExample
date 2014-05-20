package com.ahacool.designpattern.builder.test;

import com.ahacool.designpattern.builder.ConcreteBuilder;
import com.ahacool.designpattern.builder.Director;
import com.ahacool.designpattern.builder.model.Roboter;

/**
 * @ClassName BuilderTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-15
 *
 */
public class BuilderTest {
	
	public static void main(String[] args){
		Director director = new Director();
		Roboter roboter = director.createRoboter(new ConcreteBuilder());
		System.out.println("\nCheck if roboter is complete");
		System.out.println("Head is "+roboter.getmHead());
		System.out.println("Body is "+roboter.getmBody());
		System.out.println("Arm is "+roboter.getmArm());
		System.out.println("Foot is "+roboter.getmFoot());
	}

}
