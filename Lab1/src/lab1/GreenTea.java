package lab1;

public class GreenTea extends TeaBeverage {
	
	public GreenTea() {
		description = "Green Tea";
	}
	
	public double cost() {
		return super.cost() + 1.0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
}
