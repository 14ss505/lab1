package lab1;

public class HouseBlend extends CoffeeBeverage {

	public HouseBlend() {
		this.setDescription("HouseBlend");
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
