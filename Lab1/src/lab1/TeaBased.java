package lab1;

import java.util.Hashtable;

public class TeaBased implements SizeFactor {
	private Hashtable<String,Double> hash=new Hashtable<String,Double>();
	TeaBased(){
		hash.put("small", 0.2);
		hash.put("medium", 0.5);
		hash.put("large", 0.7);
		hash.put("grant", 0.9);
	}
	@Override
	public double sizeCost(String size) {
		return hash.get(size.toLowerCase());
	}

}
