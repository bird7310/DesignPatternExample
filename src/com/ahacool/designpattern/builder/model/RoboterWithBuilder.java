package com.ahacool.designpattern.builder.model;

/**
 * @ClassName RoboterWithBuilder
 * @Description A product with builder inside.
 * @author Moto
 * @date 2014 2014-5-20
 * 
 */
public class RoboterWithBuilder {
	private String mHead;
	private String mArm;
	private String mBody;
	private String mFoot;

	public String getmHead() {
		return mHead;
	}

	public String getmArm() {
		return mArm;
	}

	public String getmBody() {
		return mBody;
	}

	public String getmFoot() {
		return mFoot;
	}
	

	private RoboterWithBuilder(Builder pBuilder) {
		mHead = pBuilder.mBuilderHead;
		mBody = pBuilder.mBuilderBody;
		mArm = pBuilder.mBuilderArm;
		mFoot = pBuilder.mBuilderFoot;
	}

	public static class Builder {
		private String mBuilderHead;
		private String mBuilderArm;
		private String mBuilderBody;
		private String mBuilderFoot;

		public Builder setmBuilderHead(String mBuilderHead) {
			this.mBuilderHead = mBuilderHead;
			return this;
		}

		public Builder setmBuilderArm(String mBuilderArm) {
			this.mBuilderArm = mBuilderArm;
			return this;
		}

		public Builder setmBuilderBody(String mBuilderBody) {
			this.mBuilderBody = mBuilderBody;
			return this;
		}

		public Builder setmBuilderFoot(String mBuilderFoot) {
			this.mBuilderFoot = mBuilderFoot;
			return this;
		}

		public RoboterWithBuilder build() {
			return new RoboterWithBuilder(this);
		}

	}

}
