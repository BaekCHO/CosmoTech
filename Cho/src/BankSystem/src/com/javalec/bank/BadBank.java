package com.javalec.bank;

public class BadBank extends Bank{
	public BadBank() {
		System.out.println("Bad Bank Class");
//		setInterestRate(10.0D);
	}
	@Override
	public double getInterestRate() {
		interestRate = 10.0D;
		System.out.println("Bad Bank interestRate : " + interestRate + " %");
		return interestRate;
	}
}
