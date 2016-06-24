
public class GoodBank extends Bank {
	public GoodBank(){
		System.out.println("안녕하십니까? 좋은 은행입니다.");
	}
	public double getInterestRate(){
		InterestRate = 10;
		System.out.println("Good Bank의 이자율 : " + InterestRate);
		return InterestRate;
	}
}

