package lab1;

public class CoffeeBeverage extends Beverage {
	private String size;

	public CoffeeBeverage() {
		double[] prices = { 0.4, 0.7, 1.0, 1.3 };	
		super.sizeFactor = new SizeFactor(prices);
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
