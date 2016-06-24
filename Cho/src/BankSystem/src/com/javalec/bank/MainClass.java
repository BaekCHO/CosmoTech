package com.javalec.bank;

public class MainClass {

	public static void main(String[] args) {
		
		BadBank bad = new BadBank();
		NormalBank nomal = new NormalBank();
		GoodBank good = new GoodBank();
		
		Customer seo = new Customer(bad, "seo", 10000);
		Customer park = new Customer(nomal, "Park", 9797979);
		Customer cho = new Customer(good, "Cho", 1000);
		
		seo.tos(200, cho);
		seo.check();
		cho.check();
		
		cho.input(30000);
		cho.increment();
		cho.check();
		
		park.check();
		park.output(7879797);
		park.check();
		
	}

}
