package com.car;

public class Body {
	private String color;
	private int value;
	private int pay;
	/*
	 * Color 
	 * 	White, Black, Red, Yellow, Green
	 * 
	 * Value
	 * 	1 : Week	2 : nomal	3 : value
	 * 
	 * Pay
	 * 	1 = 50000	2 = 70000	3 = 100000
	 */
	public Body() {
		this.color = "White";
		this.value = 1;
		this.pay = 10000;
	}
	public Body(String color, int value, int pay) {
		this.color = color;
		this.value = value;
		this.pay = pay;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
