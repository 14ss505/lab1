package lab1;

public class Espresso extends CoffeeBeverage {
	
	public Espresso() {
		this.setDescription("Esspresso");
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
