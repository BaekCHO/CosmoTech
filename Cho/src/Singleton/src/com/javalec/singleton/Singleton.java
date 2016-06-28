package com.javalec.singleton;

public class Singleton {
	public int count;
	public static Singleton SINGLETON = new Singleton();
	
	private Singleton() {
	}

	public static Singleton getSingletonClass() {
		if(SINGLETON == null) {
			SINGLETON = new Singleton();
		}
		return SINGLETON;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
