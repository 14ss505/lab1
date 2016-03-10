package lab1;

import java.util.Hashtable;

public class SizeFactor {

	protected Hashtable<String, Double> hash = new Hashtable<String, Double>();
	String[] sizes = { "small", "medium", "large", "grant" };
		

	SizeFactor(double[] prices) {
		setPrices(prices);
	}

	public void setPrices(double[] prices) {
		for (int i = 0; i < sizes.length; i++) {
			this.hash.put(sizes[i], prices[i]);
		}
	}

	public double sizeCost(String size) {
		return hash.get(size.toLowerCase());
	}

}
