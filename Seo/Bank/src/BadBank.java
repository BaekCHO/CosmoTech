
public class BadBank extends Bank {
	public BadBank(){
		System.out.println("안녕하십니까? 나쁜 은행입니다.");
	}
	public double getInterestRate(){
		super.InterestRate = 3;
		System.out.println("Bad Bank의 이자율 : " + InterestRate);
		return InterestRate;
	}
}
