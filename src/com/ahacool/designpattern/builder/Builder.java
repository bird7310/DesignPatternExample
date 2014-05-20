package com.ahacool.designpattern.builder;

import com.ahacool.designpattern.builder.model.Roboter;

/**
 * @ClassName Builder
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-15
 * 
 */
public interface Builder {

	void buildHead();

	void buildArm();

	void buildBody();

	void buildFoot();

	Roboter buildRoboter();

}
