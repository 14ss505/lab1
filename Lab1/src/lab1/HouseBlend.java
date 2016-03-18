package lab1;

public class HouseBlend extends CoffeeBeverage {

	public HouseBlend() {
		setCost(0.8);
		description = "HouseBlend";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost()+this.cost;
	}
}
