package com.ahacool.designpattern.builder;

import com.ahacool.designpattern.builder.model.Roboter;

/**
 * @ClassName RoboterDirector
 * @Description Define the build order. 
 * @author Moto
 * @date 2014 2014-5-20
 * 
 */
public class RoboterDirector {

	public Roboter createRoboter(RoboterBuilder pBuilder) {
		System.out.println("Start building roboter");
		pBuilder.buildHead();
		pBuilder.buildBody();
		pBuilder.buildArm();
		pBuilder.buildFoot();
		return pBuilder.buildRoboter();
	}

}
