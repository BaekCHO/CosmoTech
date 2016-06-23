
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
		
		
		System.out.print("자동차 전체의 가격은 "  + total + "원 입니다.");		
	}
	public void setHandle(){
		if(hd.getDegree()>=0 && hd.getDegree() <90){
			System.out.println("핸들은 왼쪽 방향입니다.");
		}
		else if(hd.getDegree() == 90){
			System.out.println("핸들은 중앙입니다.");
		}
		else if(hd.getDegree()>90 && hd.getDegree() <=180){
			System.out.println("핸들은 오른쪽 방향입니다.");
		}
	}
	public void printInfo(){
		System.out.println("자동차의 색상은 " + by.getColor() + "입니다.");
		System.out.println("자동차의 CC는 " + eg.getCC() + "CC 입니다.");
		System.out.println("자동차의 기어는" + eg.getGear() + "단 입니다.");
	}
	
}
