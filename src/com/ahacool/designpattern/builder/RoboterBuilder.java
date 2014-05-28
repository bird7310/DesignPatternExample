package com.ahacool.designpattern.builder;

import com.ahacool.designpattern.builder.model.Roboter;

/**
 * @ClassName RoboterBuilder
 * @Description Define build interface.
 * @author Moto
 * @date 2014 2014-5-15
 * 
 */
public interface RoboterBuilder {

	void buildHead();

	void buildArm();

	void buildBody();

	void buildFoot();

	Roboter buildRoboter();

}
