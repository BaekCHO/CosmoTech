
public class NormalBank extends Bank {
	public NormalBank(){
		System.out.println("�ȳ��Ͻʴϱ�? ����� �����Դϴ�.");
	}
	public double getInterestRate(){
		super.InterestRate = 5;
		System.out.println("Normal Bank�� ������ : " + InterestRate);
		return InterestRate;
	}
}