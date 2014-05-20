package com.ahacool.designpattern.builder.model;

/**
 * @ClassName RoboterWithBuilder
 * @Description TODO
 * @author Moto
 * @date 2014 2014-5-20
 * 
 */
public class RoboterWithBuilder {
	private String mHead;
	private String mArm;
	private String mBody;
	private String mFoot;
	private String mWing;
	private String mTools;

	private RoboterWithBuilder(Builder pBuilder) {
		mHead = pBuilder.mBuilderHead;
		mBody = pBuilder.mBuilderBody;
		mArm = pBuilder.mBuilderArm;
		mFoot = pBuilder.mBuilderFoot;
		mWing = pBuilder.mBuilderWing;
		mTools = pBuilder.mBuilderTools;
	}

	public static class Builder {
		private String mBuilderHead;
		private String mBuilderArm;
		private String mBuilderBody;
		private String mBuilderFoot;
		private String mBuilderWing;
		private String mBuilderTools;

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

		public Builder setmBuilderWing(String mBuilderWing) {
			this.mBuilderWing = mBuilderWing;
			return this;
		}

		public Builder setmBuilderTools(String mBuilderTools) {
			this.mBuilderTools = mBuilderTools;
			return this;
		}

		public RoboterWithBuilder build() {
			return new RoboterWithBuilder(this);
		}

	}

}
