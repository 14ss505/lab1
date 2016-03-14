package lab1;

public class Espresso extends CoffeeBeverage {
	
	public Espresso() {
		this.setDescription("Espresso");
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
