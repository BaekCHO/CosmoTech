
public class NormalBank extends Bank {
	public NormalBank(){
		
	}
	public double getInterestRate(){
		System.out.println("==============����=============");	
		System.out.println("�ȳ��Ͻʴϱ�? ����� �����Դϴ�.");
		super.interestRate = 5;
		System.out.println("Normal Bank�� ���� �������� : " + interestRate);
		return interestRate;
	}
}