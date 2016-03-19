package lab1;

import java.text.DecimalFormat;

public class HouseBlend extends CoffeeBeverage {

	public HouseBlend() {
		setCost(0.8);
		description = "HouseBlend";
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
