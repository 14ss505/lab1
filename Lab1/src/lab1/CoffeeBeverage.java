package lab1;

public abstract class CoffeeBeverage extends Beverage {
	protected String size;

	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
	}

	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}

	public void setSize(String size) {
		this.size = size;
	}

}
