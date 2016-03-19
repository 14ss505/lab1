package lab1;

import java.text.DecimalFormat;

public class GreenTea extends TeaBeverage {
	
	public GreenTea() {
		setCost(1.0);
		description = "Green Tea";
	}
	
	public String getDescription() {
		return description;
	}
	public double cost() {
		DecimalFormat df = new DecimalFormat(".0");
		double result = Double.parseDouble(df.format(super.cost()+this.cost));
		return result;
	}
}
