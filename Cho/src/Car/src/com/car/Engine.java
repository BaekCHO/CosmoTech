package com.car;

public class Engine {
	private int cc;
	private String color;
	private String made;
	private int pay;
	public Engine() {
		cc = 2000;
		color = "Siver";
		made = "Audi";
		pay = 100000;
	}
	public Engine(int cc, String color, String made, int pay) {
		this.cc = cc;
		this.color = color;
		this.made = made;
		this.pay = pay;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
}
