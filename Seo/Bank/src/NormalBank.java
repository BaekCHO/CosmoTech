
public class NormalBank extends Bank {
	public NormalBank(){
		System.out.println("안녕하십니까? 평범한 은행입니다.");
	}
	public double getInterestRate(){
		super.InterestRate = 5;
		System.out.println("Normal Bank의 이자율 : " + InterestRate);
		return InterestRate;
	}
}