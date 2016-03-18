package lab1;

public class GreenTea extends TeaBeverage {
	
	public GreenTea() {
		setCost(1.0);
		description = "Green Tea";
	}
	
	public String getDescription() {
		return description;
	}
	public double cost() {
		return super.cost()+this.cost;
	}
}
