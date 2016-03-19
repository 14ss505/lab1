package lab1;

import java.text.DecimalFormat;

public class Decaf extends CoffeeBeverage {

	public Decaf() {
		setCost(0.5);
		description = "Decaf";
	}

	public String getDescription() {
		return description;	}

	public double cost() {
		DecimalFormat df = new DecimalFormat(".0");
		double result = Double.parseDouble(df.format(super.cost()+this.cost));
		return result;
	}

}
