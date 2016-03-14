package lab1;

public class GreenTea extends TeaBeverage {
	
	public GreenTea() {
		this.setDescription("Green Tea");
	}
	
	public String getDiscription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
