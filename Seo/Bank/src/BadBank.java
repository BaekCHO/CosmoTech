
public class BadBank extends Bank {
	public BadBank(){
		
	}
	public double getInterestRate(){
		System.out.println("==============����=============");	
		System.out.println("�ȳ��Ͻʴϱ�? ���� �����Դϴ�.");
		super.interestRate = 3;
		System.out.println("Bad Bank�� ���� �������� : " + interestRate);
		return interestRate;
	}
}
