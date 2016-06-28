package com.javalec.singleton;

public class FirstClass {
	Singleton single;
	public FirstClass() {
		this.single = Singleton.getSingletonClass();
		printInfo();
	}
	
	private void printInfo() {
		System.out.println("Count : "+single.getCount());
		single.setCount(10);
	}
}
