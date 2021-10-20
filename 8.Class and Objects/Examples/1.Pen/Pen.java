
public class Pen {
	private float price;
	private String color;

	public Pen(float price, String color) {
		// this price indicate the local argument price
		if (price < 0.0f) {
			throw new IllegalArgumentException("Price is negative");
		}

		this.price = price;
		this.color = color;
	}

	public void setPrice(float price) {
		// this price indicate the local argument price
		if (price < 0.0f) {
			throw new IllegalArgumentException("Price is negative");
		}

		this.price = price;
	}

	public float getPrice() {
		// this price indicate the global member variable price
		return price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}