package com.javalec.bank;

public class NormalBank extends Bank{
	public NormalBank() {
		System.out.println("Nomal Bank Class");
//		setInterestRate(5.0D);
	}
	@Override
	public double getInterestRate() {
		interestRate = 5.0D;
		System.out.println("Bad Bank interestRate : " + interestRate + " %");
		return interestRate;
	}
}
