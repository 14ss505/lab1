package lab1;

public abstract class Beverage {
	protected SizeFactor sizeFactor;//for size cost
	protected String description;
	
	public double cost() {
		return 0;
	}//already implemented for us

	public abstract String getDescription();
	//need to implement getDescription in the subclasses.
}
