package com.javalec.bank;

public class Customer extends Bank{
	public int account; //total
	public String name;
	public int money;
	public Bank bank;
	
	public Customer(Bank bank, String name, int money) {
		this.account = money;
		this.name = name;
		this.money = money;
		this.bank = bank;
		
		System.out.println(name + "님 안녕하세요.");
		System.out.println("초기 통장 입금 금액은 $" + money + "입니다.");
	}
	
	public int input(int money) {
		account += money;
		System.out.println(name + "님 입금되는 금액은 $" + money + " 이고, 잔액은 $" + account + " 입니다.");
		return account;
	}
	
	public int output(int money) {
		account -= money;
		System.out.println(name + "출금되는 금액은 $" + money + " 이고, 잔액은 $" +account + " 입니다.");
		return account;
		
	}
	
	public void tos(int money, Customer cs) {
		System.out.println("계좌이체 중 입니다...");
		this.output(money);
		cs.input(money);
		System.out.println("계좌이체 완료하였습니다. 남은 계좌 잔액은 $ " + account + " 입니다.");
	}
	
	public int check() {
		System.out.println(name + " 님 계좌 잔액은 $ " + account + "입니다.");
		return account;
	}
	
	public void increment() {
		int rate = (int) bank.getInterestRate();
		account += (account * rate / 100);
		System.out.println("이자율이 "+ rate + "% 적용 되었습니다." + 
							name + "님 계좌 잔액은 $ " + account + " 입니다.");
	}
}
