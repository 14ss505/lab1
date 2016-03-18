package lab1;

public class Decaf extends CoffeeBeverage {

	public Decaf() {
		setCost(0.5);
		description = "Decaf";
	}

	public String getDescription() {
		return description;	}

	public double cost() {
		return super.cost()+this.cost;
	}

}
