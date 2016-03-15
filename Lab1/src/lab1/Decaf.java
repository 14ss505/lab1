package lab1;

public class Decaf extends CoffeeBeverage {

	public Decaf() {
		this.setDescription("Decaf");;
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.5;
	}

}
