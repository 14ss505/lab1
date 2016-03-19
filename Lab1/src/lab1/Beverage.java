package lab1;

public abstract class Beverage {
	protected double cost;//all subclasses extends it
	protected String description;

	// add default constructor
	public Beverage() {

	}

	public String getDescription() {
		return description;
	}

	// add setter for cost
	protected void setCost(double cost) {
		this.cost = cost;
	}

	// add getter for cost
	public double cost() {
		return 0;
	}
}
