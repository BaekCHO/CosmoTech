
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
		System.out.println(money + "�� �ԱݵǾ����ϴ�.");
		System.out.println("���� ������ �ܰ� : " + savedMoney);
		System.out.println();
	}
	public void withdrawMoney(int money){
		System.out.println(money + "�� ��ݵǾ����ϴ�.");
		savedMoney = savedMoney - money; 
		System.out.println("���� ������ �ܰ� : " + savedMoney);
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
		System.out.println("����� ���������� " + yearlyMoney + "�Դϴ�.");
		System.out.println();
	}
}