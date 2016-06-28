package com.javalec.singleton;

public class SecondClass {
	Singleton single;
	public SecondClass() {
		this.single = Singleton.getSingletonClass();
		printInfo();
	}
	
	private void printInfo() {
		System.out.println("Count : "+single.getCount());
		single.setCount(200);
	}
}
