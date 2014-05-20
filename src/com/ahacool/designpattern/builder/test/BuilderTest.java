package com.ahacool.designpattern.builder.test;

import com.ahacool.designpattern.builder.ConcreteBuilder;
import com.ahacool.designpattern.builder.Director;
import com.ahacool.designpattern.builder.model.Roboter;
import com.ahacool.designpattern.builder.model.RoboterWithBuilder;

/**
 * @ClassName BuilderTest
 * @Description Show how to use Builder.
 * @author Moto
 * @date 2014 2014-5-15
 *
 */
public class BuilderTest {
	
	public static void main(String[] args){
		// Show statand Builder.
		Director director = new Director();
		Roboter roboter = director.createRoboter(new ConcreteBuilder());
		System.out.println("\nCheck if roboter is complete");
		System.out.println("Head is "+roboter.getmHead());
		System.out.println("Body is "+roboter.getmBody());
		System.out.println("Arm is "+roboter.getmArm());
		System.out.println("Foot is "+roboter.getmFoot());
		// Show common Builder.
		RoboterWithBuilder roboter1 = new RoboterWithBuilder.Builder()
															.setmBuilderArm("arm")
															.setmBuilderBody("body")
															.setmBuilderHead("head")
															.setmBuilderFoot("foot")
															.build();
		System.out.println("\nCheck if roboter1 is complete");
		System.out.println("Head is "+roboter1.getmHead());
		System.out.println("Body is "+roboter1.getmBody());
		System.out.println("Arm is "+roboter1.getmArm());
		System.out.println("Foot is "+roboter1.getmFoot());
		// Show common instantiation.
		Roboter roboter2 = new Roboter();
		roboter2.setmArm("arm");
		roboter2.setmBody("body");
		roboter2.setmHead("head");
		roboter2.setmFoot("foot");
		System.out.println("\nCheck if roboter2 is complete");
		System.out.println("Head is "+roboter2.getmHead());
		System.out.println("Body is "+roboter2.getmBody());
		System.out.println("Arm is "+roboter2.getmArm());
		System.out.println("Foot is "+roboter2.getmFoot());
	}

}
