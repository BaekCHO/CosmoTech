
public class GoodBank extends Bank {
	public GoodBank(){
		System.out.println("�ȳ��Ͻʴϱ�? ���� �����Դϴ�.");
	}
	public double getInterestRate(){
		InterestRate = 10;
		System.out.println("Good Bank�� ������ : " + InterestRate);
		return InterestRate;
	}
}

