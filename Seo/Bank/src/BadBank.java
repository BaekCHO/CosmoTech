
public class BadBank extends Bank {
	public BadBank(){
		System.out.println("�ȳ��Ͻʴϱ�? ���� �����Դϴ�.");
	}
	public double getInterestRate(){
		super.InterestRate = 3;
		System.out.println("Bad Bank�� ������ : " + InterestRate);
		return InterestRate;
	}
}
