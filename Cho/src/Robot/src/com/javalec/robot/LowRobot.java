package com.javalec.robot;

import com.javalec.robot.component.NeverFly;
import com.javalec.robot.component.NoneMissile;
import com.javalec.robot.component.WeakSword;

public class LowRobot extends Robot{
	public LowRobot() {
		fly = new NeverFly();
		missile = new NoneMissile();
		sword = new WeakSword();

		System.out.println("=====================Low Robot=========================");
		shape();
		System.out.println("============================================================");
	}
	@Override
	public void shape() {
		System.out.println("I'm Low"
				+ "Robot");
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
	}

}