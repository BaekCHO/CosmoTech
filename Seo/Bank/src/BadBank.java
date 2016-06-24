
public class BadBank extends Bank {
	public BadBank(){
		
	}
	public double getInterestRate(){
		System.out.println("==============은행=============");	
		System.out.println("안녕하십니까? 나쁜 은행입니다.");
		super.interestRate = 3;
		System.out.println("Bad Bank의 저금 연이자율 : " + interestRate);
		return interestRate;
	}
}
