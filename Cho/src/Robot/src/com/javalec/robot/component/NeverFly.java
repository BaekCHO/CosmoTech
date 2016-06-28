package com.javalec.robot.component;

public class NeverFly implements IFly {

	@Override
	public void getFly() {
		System.out.println("I never fly.");
	}

}
