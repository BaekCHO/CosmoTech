
public class Car {
	
	Body by;
	Engine eg;
	Handle hd;
	
	
	
	public Car(){
		by = new Body();
		eg = new Engine();
		hd = new Handle();
	}
	
	public Car(Body by, Engine eg, Handle hd) {
		this.by = by;
		this.eg = eg;
		this.hd = hd;
	}

	
	public void printPrice() {
		int i = by.getPrice();
		int j = eg.getPrice();
		int total =i + j;
		
		
		System.out.print("�ڵ��� ��ü�� ������ "  + total + "�� �Դϴ�.");		
	}
	public void setHandle(){
		if(hd.getDegree()>=0 && hd.getDegree() <90){
			System.out.println("�ڵ��� ���� �����Դϴ�.");
		}
		else if(hd.getDegree() == 90){
			System.out.println("�ڵ��� �߾��Դϴ�.");
		}
		else if(hd.getDegree()>90 && hd.getDegree() <=180){
			System.out.println("�ڵ��� ������ �����Դϴ�.");
		}
	}
	public void printInfo(){
		System.out.println("�ڵ����� ������ " + by.getColor() + "�Դϴ�.");
		System.out.println("�ڵ����� CC�� " + eg.getCC() + "CC �Դϴ�.");
		System.out.println("�ڵ����� ����" + eg.getGear() + "�� �Դϴ�.");
	}
	
}
