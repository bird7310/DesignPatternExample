package com.ahacool.designpattern.builder;

import com.ahacool.designpattern.builder.model.Roboter;

/**
 * @ClassName ConcreteBuilder
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-20
 * 
 */
public class ConcreteBuilder implements Builder {

	private Roboter mRoboter;

	public ConcreteBuilder() {
		mRoboter = new Roboter();
	}

	@Override
	public void buildHead() {
		System.out.println("Build head");
		mRoboter.setmHead("head");
	}

	@Override
	public void buildArm() {
		System.out.println("Build arm");
		mRoboter.setmArm("arm");
	}

	@Override
	public void buildBody() {
		System.out.println("Build body");
		mRoboter.setmBody("body");
	}

	@Override
	public void buildFoot() {
		System.out.println("Build foot");
		mRoboter.setmFoot("foot");
	}

	@Override
	public Roboter buildRoboter() {
		System.out.println("Build complete");
		return mRoboter;
	}

}
