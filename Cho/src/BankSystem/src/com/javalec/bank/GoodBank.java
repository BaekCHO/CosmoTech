package com.javalec.bank;

public class GoodBank extends Bank{
	public GoodBank() {
		System.out.println("Band Bank Class");
//		setInterestRate(3.0D);
	}
	@Override
	public double getInterestRate() {
		interestRate = 3.0D;
		System.out.println("Bad Bank interestRate : " + interestRate + " %");
		return interestRate;
	}
}
