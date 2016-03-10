package lab1;

import java.util.ArrayList;

public class SizeFactor {
	String[] sizes = { "small", "medium", "large", "grant" };
	double[] prices ;
	
	SizeFactor(){
		setASCPrices( prices);
	}

	public void setASCPrices(double[] prices) {
		this.prices = prices;
	}

	public double sizeCost(String size) {
		int i = 0;
		for (i = 0; i < sizes.length; i++) {
			if (sizes[i].toLowerCase().equals(size.toLowerCase())) {
				break;
			}
		}
		// check if i is valid

		return prices[i];
	}

}
