package lab1;

public class WhiteTea extends TeaBeverage {
	
	public WhiteTea() {
		setCost(1.0);
		description = "White Tea";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost()+this.cost;
	}
}
