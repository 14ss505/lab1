package lab1;

public   class CoffeeBeverage extends Beverage {
	protected SizeFactor sizeFactor;//move sizeFactor from superclass because other subclasses may not need this data.
	protected String size;

	public CoffeeBeverage() {
		this.sizeFactor = new CoffeeBased();
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
	public double cost() {
		return super.cost() +this.sizeFactor.sizeCost(size);
	}
}
