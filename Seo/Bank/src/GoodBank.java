
public class GoodBank extends Bank {
	public GoodBank(){
	
	}
	public double getInterestRate(){
		System.out.println("==============은행=============");	
		System.out.println("안녕하십니까? 좋은 은행입니다.");
		interestRate = 10;
		System.out.println("Good Bank의 저금 연이자율 : " + interestRate);
		return interestRate;
	}
}

