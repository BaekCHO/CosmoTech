
public class GoodBank extends Bank {
	public GoodBank(){
	
	}
	public double getInterestRate(){
		System.out.println("==============����=============");	
		System.out.println("�ȳ��Ͻʴϱ�? ���� �����Դϴ�.");
		interestRate = 10;
		System.out.println("Good Bank�� ���� �������� : " + interestRate);
		return interestRate;
	}
}

