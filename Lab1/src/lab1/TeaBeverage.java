package lab1;

public abstract class TeaBeverage extends Beverage {
	protected SizeFactor sizeFactor;//move sizeFactor from superclass because other subclasses may not need this data.
	private String size;

	public TeaBeverage() {
		this.sizeFactor = new TeaBased();
	}

	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	
	public double cost() {
		return super.cost() + this.sizeFactor.sizeCost(size);
	}
}
