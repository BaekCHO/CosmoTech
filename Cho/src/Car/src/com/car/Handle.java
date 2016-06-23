package com.car;

public class Handle {
	private int degree;
	private String value;
	
	/*
	 * Degree
	 * 	1 : 0	2 : 90	3 : 180
	 * 
	 * Value
	 * 	Nomal, Power
	 */
	public Handle() {
		degree = 2;
		value = "nomal";
	}
	
	public Handle(int degree, String value) {
		this.degree = degree;
		this.value = value;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
