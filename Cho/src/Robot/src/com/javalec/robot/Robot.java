package com.javalec.robot;

import com.javalec.robot.component.IFly;
import com.javalec.robot.component.IMissile;
import com.javalec.robot.component.ISword;

public abstract class Robot {
	
	IFly fly;
	IMissile missile;
	ISword sword;
	
	public Robot() {
		setFly(fly);
		setMissile(missile);
		setSword(sword);
	}
	
	public abstract void shape();
	
	public void actionRun(){
		System.out.println("I can run.");
	}
	public void actionWalk() {
		System.out.println("I can walk.");
	}

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	public void setSword(ISword sword) {
		this.sword = sword;
	}
	
	public void actionFly() {
		this.fly.getFly();
	}
	public void actionMissile() {
		this.missile.getMissile();
	}
	public void actionSword() {
		this.sword.getSword();
	}
}
