package weekend2;

public class Jet {
	private String model;
	private int speed;
	private int range;
	private double price;

	public Jet() {
		// TODO Auto-generated constructor stub
	}

	public Jet(String model, int speed, int range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public int getSpeed() {
		return speed;
	}

	public int getRange() {
		return range;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jets [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
}
