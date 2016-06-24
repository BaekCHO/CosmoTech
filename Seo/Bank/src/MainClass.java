
public class MainClass {
	public static void main(String[] args) {
		Bank good = new GoodBank();
		good.getInterestRate();
		
		Bank bad = new BadBank();
		bad.getInterestRate();
		
		Bank normal = new NormalBank();
		normal.getInterestRate();
	}
}
