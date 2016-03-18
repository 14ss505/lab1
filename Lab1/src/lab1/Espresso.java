package lab1;

public class Espresso extends CoffeeBeverage {

	public Espresso() {
		setCost(1.0);
		description = "Espresso";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost()+this.cost;
	}
}
