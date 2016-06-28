package com.javalec.singleton;

public class ThirdClass {
	Singleton single;
	public ThirdClass() {
		this.single = Singleton.getSingletonClass();
		printInfo();
	}
	
	private void printInfo() {
		System.out.println("Count : "+single.getCount());
	}

}
