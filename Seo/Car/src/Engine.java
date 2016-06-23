/**
 * 
 * @author seo
 * @project
 */
public class Engine {
	private int CC;
	private int price;
	private int gear;

	public Engine() {
		CC = 125;
		price = 20000;
		gear = 1;
	}

	public Engine(int a, int b, int c) {
		CC = a;
		price = b;
		gear = c;
	}

	public int getCC() {
		return CC;
	}

	public void setCC(int cC) {
		CC = cC;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int accel) {
		this.gear = accel;
	}

}
