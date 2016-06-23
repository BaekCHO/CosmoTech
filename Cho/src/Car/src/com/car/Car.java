package com.car;

public class Car {
	Body bd;
	Engine eg;
	Handle hd;
	
	public Car() {
		bd = new Body();
		eg = new Engine();
		hd = new Handle();
	}
	public Car(Body bd, Engine eg, Handle hd) {
		this.bd = bd;
		this.eg = eg;
		this.hd = hd;
	}
	
	public void printPrive() {
		int total;
		int bdPay = bd.getPay();
		int egPay = eg.getPay();
		total = bdPay + egPay;
		System.out.println("This is Car price : $ " + total + ".");
	}
	
	public void printCurrentHandle() {
		int getValue = hd.getDegree();
		switch(getValue) {
		case 1:
			System.out.println("Current : Turn Right");
			break;
		case 2:
			System.out.println("Current : Go Straight");
			break;
		case 3:
			System.out.println("Current : Turn Left");
			break;
		}
	}
	
	@Override
	public String toString() {
		String info;
		//About body
		String bdColor = bd.getColor();
		int dbValue = bd.getValue();
		String bodyValue = "";
		switch(dbValue) {
			case 1:
				bodyValue = "Week";
				break;
			case 2:
				bodyValue = "Nomal";
				break;
			case 3:
				bodyValue = "Strong";
				break;
		}
		
		//About Engine
		int egCc = eg.getCc();
		String egColor = eg.getColor();
		String egMade = eg.getMade();
		
		//About Handle
		String handleValue = hd.getValue();
		info = "====================[Car Informatino]=====================\n";
		info += "[BodyColor] : " + bdColor + "\n";
		info += "[BodyValue] : " + bodyValue + " Body\n";
		info += "---------------------------------------------------------\n";
		info += "[EngineColor] : " + egColor + "\n";
		info += "[EngineCC] : " + egCc + "\n";
		info += "[EngingMade] : " + egMade + "\n";
		info += "---------------------------------------------------------\n";
		info += "[Handle]" + handleValue + " Handle\n";
		info += "=========================================================\n";
		return info;
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.toString());
		c1.printPrive();
		c1.printCurrentHandle();

		
		Body by1 = new Body("Green", 3, 9999999);
		Engine eg1 = new Engine(7000, "Green", "BMW", 99000000);
		Handle hd1 = new Handle(2, "Power");
		
		Car c2 = new Car(by1, eg1, hd1);
		System.out.println(c2.toString());
		c2.printPrive();
		c2.printCurrentHandle();
	}

}
