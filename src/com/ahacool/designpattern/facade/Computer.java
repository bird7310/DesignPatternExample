package com.ahacool.designpattern.facade;

/**
 * @ClassName Computer
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class Computer {

	private CPU mCPU;
	private Disk mDisk;
	private Screen mScreen;

	public Computer() {
		mCPU = new CPU();
		mDisk = new Disk();
		mScreen = new Screen();
	}

	public void startUp() {
		System.out.println("开始 启动电脑");
		mCPU.startUp();
		mDisk.startUp();
		mScreen.startUp();
		System.out.println("完成 启动电脑\n");
	}

	public void shutDown() {
		System.out.println("开始 关闭电脑");
		mCPU.shutDown();
		mDisk.shutDown();
		mScreen.shutDown();
		System.out.println("完成 关闭电脑\n");
	}

}
