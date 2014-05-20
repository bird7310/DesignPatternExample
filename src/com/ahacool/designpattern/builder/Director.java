package com.ahacool.designpattern.builder;

import com.ahacool.designpattern.builder.model.Roboter;

/**
 * @ClassName Director
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-20
 * 
 */
public class Director {

	public Roboter createRoboter(Builder pBuilder) {
		System.out.println("Start building roboter");
		pBuilder.buildHead();
		pBuilder.buildBody();
		pBuilder.buildArm();
		pBuilder.buildFoot();
		return pBuilder.buildRoboter();
	}

}
