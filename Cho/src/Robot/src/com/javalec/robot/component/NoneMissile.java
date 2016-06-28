package com.javalec.robot.component;

public class NoneMissile implements IMissile {

	@Override
	public void getMissile() {
		System.out.println("I don't have a missile.");
	}

}
