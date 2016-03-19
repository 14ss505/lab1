package lab1;

import java.text.DecimalFormat;

public class WhiteTea extends TeaBeverage {
	
	public WhiteTea() {
		setCost(1.0);
		description = "White Tea";
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
