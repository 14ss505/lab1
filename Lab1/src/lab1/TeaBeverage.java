package lab1;

public class TeaBeverage extends Beverage {
	private String size;

	public TeaBeverage() {
		double[] prices = { 0.2, 0.5, 0.7, 0.9 };	
		super.sizeFactor = new SizeFactor(prices);
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
