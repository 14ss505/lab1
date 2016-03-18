package lab1;

public class RedTea extends TeaBeverage {
	
	public RedTea() {
		setCost(0.8);
		description = "Red Tea";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost()+this.cost;
	}
}
