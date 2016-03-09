package lab1;

public class DecafMocha extends CoffeeBeverage {
	private String description;
	private Decaf decaf;
	private Chocolate chocolate;

	public DecafMocha() {
		description = "DecafMocha";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + decaf.cost() + chocolate.cost();
	}
}
