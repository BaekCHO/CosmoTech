
public class CarDrive {
	public static void main(String args[]) {
		Car myCar = new Car();
		
		myCar.by.setColor("black");
		myCar.eg.setGear(2);
		
		myCar.printInfo();
		System.out.println();
		
		myCar.setHandle();
		
		System.out.println();
		
		myCar.printPrice();
	}
}