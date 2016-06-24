
public class Customer {
	
	int savedMoney=0;
	double yearlyMoney;
	
	
	BadBank bad = new BadBank();
	NormalBank normal = new NormalBank();
	GoodBank good = new GoodBank();
	double goodRate = good.getInterestRate();
	double normalRate = normal.getInterestRate();
	double badRate = bad.getInterestRate();
	
	public Customer(){
	}
	
	public void depositMoney(int money){
		savedMoney = savedMoney + money;		
		System.out.println(money + "가 입금되었습니다.");
		System.out.println("현재 통장의 잔고 : " + savedMoney);
		System.out.println();
	}
	public void withdrawMoney(int money){
		System.out.println(money + "가 출금되었습니다.");
		savedMoney = savedMoney - money; 
		System.out.println("현재 통장의 잔고 : " + savedMoney);
		System.out.println();
	}
	
	public void setRate(String nu){
		switch(nu){
			case "good":
				yearlyMoney =  savedMoney * goodRate / 100;
				break;
			case "normal":
				yearlyMoney =  savedMoney * normalRate / 100;
				break;
			case "bad":
				yearlyMoney =  savedMoney * badRate / 100;
				break;
		}
		System.out.println("당신의 연이자율은 " + yearlyMoney + "입니다.");
		System.out.println();
	}
}