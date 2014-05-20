package com.ahacool.designpattern.builder.test;

import com.ahacool.designpattern.builder.model.RoboterWithBuilder;
import com.ahacool.designpattern.builder.model.RoboterWithoutBuilder;

/**
 * @ClassName RoboterBuilderTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-20
 * 
 */
public class RoboterBuilderTest {
	public static void main(String[] args) {
		RoboterWithBuilder roboter1 = new RoboterWithBuilder.Builder()
													.setmBuilderArm("arm")
													.setmBuilderBody("body")
													.setmBuilderHead("head")
													.setmBuilderFoot("foot")
													.setmBuilderWing("wing")
													.setmBuilderTools("tools")
													.build();
		
		RoboterWithoutBuilder roboter2 = new RoboterWithoutBuilder();
		roboter2.setmArm("arm");
		roboter2.setmBody("body");
		roboter2.setmHead("head");
		roboter2.setmFoot("foot");
		roboter2.setmWing("wing");
		roboter2.setmTools("tools");
	}
}
