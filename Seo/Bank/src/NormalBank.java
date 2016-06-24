
public class NormalBank extends Bank {
	public NormalBank(){
		
	}
	public double getInterestRate(){
		System.out.println("==============은행=============");	
		System.out.println("안녕하십니까? 평범한 은행입니다.");
		super.interestRate = 5;
		System.out.println("Normal Bank의 저금 연이자율 : " + interestRate);
		return interestRate;
	}
}