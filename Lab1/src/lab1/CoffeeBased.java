package lab1;

import java.util.Hashtable;

public class CoffeeBased implements SizeFactor {
	private Hashtable<String,Double> hash=new Hashtable<String,Double>();
	CoffeeBased(){
		hash.put("small", 0.4);
		hash.put("medium", 0.7);
		hash.put("large", 1.0);
		hash.put("grant", 1.3);
	}
	@Override
	public double sizeCost(String size) {
		return hash.get(size.toLowerCase());
	}

}
