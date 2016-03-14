package lab1;

public class RedTea extends TeaBeverage {
	public RedTea() {
		this.setDescription("Red Tea");
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
