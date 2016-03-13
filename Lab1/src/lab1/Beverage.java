package lab1;

public class Beverage {
	protected SizeFactor sizeFactor;//for size cost
	protected String description;
	protected String size;
	public double cost() {
		return 0;
	}

	public String getDescription() {
		return description;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
