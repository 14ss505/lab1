package lab1;

import java.text.DecimalFormat;

public class RedTea extends TeaBeverage {
	
	public RedTea() {
		setCost(0.8);
		description = "Red Tea";
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
