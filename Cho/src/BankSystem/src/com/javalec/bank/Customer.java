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
		
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("�ʱ� ���� �Ա� �ݾ��� $" + money + "�Դϴ�.");
	}
	
	public int input(int money) {
		account += money;
		System.out.println(name + "�� �ԱݵǴ� �ݾ��� $" + money + " �̰�, �ܾ��� $" + account + " �Դϴ�.");
		return account;
	}
	
	public int output(int money) {
		account -= money;
		System.out.println(name + "��ݵǴ� �ݾ��� $" + money + " �̰�, �ܾ��� $" +account + " �Դϴ�.");
		return account;
		
	}
	
	public void tos(int money, Customer cs) {
		System.out.println("������ü �� �Դϴ�...");
		this.output(money);
		cs.input(money);
		System.out.println("������ü �Ϸ��Ͽ����ϴ�. ���� ���� �ܾ��� $ " + account + " �Դϴ�.");
	}
	
	public int check() {
		System.out.println(name + " �� ���� �ܾ��� $ " + account + "�Դϴ�.");
		return account;
	}
	
	public void increment() {
		int rate = (int) bank.getInterestRate();
		account += (account * rate / 100);
		System.out.println("�������� "+ rate + "% ���� �Ǿ����ϴ�." + 
							name + "�� ���� �ܾ��� $ " + account + " �Դϴ�.");
	}
}
