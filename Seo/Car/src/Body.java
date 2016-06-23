/**
 * 
 * @author seo
 * @project
 */
public class Body {
	private String color;
	private int price;

	public Body() {
		color = "white";
		price = 100000;
	}

	public Body(String a, int b) {
		color = a;
		price = b;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
