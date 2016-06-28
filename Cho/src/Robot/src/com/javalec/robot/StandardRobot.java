package com.javalec.robot;

import com.javalec.robot.component.CanFly;
import com.javalec.robot.component.LocketMissile;
import com.javalec.robot.component.NomalSword;

public class StandardRobot extends Robot{
	public StandardRobot() {
		fly = new CanFly();
		missile = new LocketMissile();
		sword = new NomalSword();

		System.out.println("=====================Standard Robot=========================");
		shape();
		System.out.println("============================================================");
	}
	@Override
	public void shape() {
		System.out.println("I'm StandardRobot");
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
	}
}
