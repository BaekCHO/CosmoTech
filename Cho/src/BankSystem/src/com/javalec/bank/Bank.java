package com.javalec.bank;

public class Bank {
	public double interestRate;
	
	public Bank() {
		System.out.println("The Bank Class");
	}
	public double getInterestRate() {
		interestRate = 0.0D;
		System.out.println("The Bank interestRate : " + interestRate + " %");
		return interestRate;
	}
//	public void setInterestRate(double interestRate) {
//		this.interestRate = interestRate;
//	}
}
