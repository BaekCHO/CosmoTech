package com.javalec.robot;

import com.javalec.robot.component.CanFly;
import com.javalec.robot.component.LazerMissile;
import com.javalec.robot.component.StrongSword;

public class SuperRobot extends Robot{
	
	public SuperRobot() {
		fly = new CanFly();
		missile = new LazerMissile();
		sword = new StrongSword();
		
		System.out.println("=====================Super Robot============================");
		shape();
		System.out.println("============================================================");
	}
	@Override
	public void shape() {
		System.out.println("I'm SuperRobot");
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
	}
}
