package lab1;

import java.text.DecimalFormat;

public class Espresso extends CoffeeBeverage {

	public Espresso() {
		setCost(1.0);
		description = "Espresso";
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
