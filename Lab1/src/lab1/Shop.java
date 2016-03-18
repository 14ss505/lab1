package lab1;

public class Shop {
	private BeverageFactory bf;
	public Shop(BeverageFactory bf){
		this.bf = bf;
	}
	public Beverage orderBeverage(String beveStr, String size, String ingredient){
		Beverage order = bf.makeOrder(beveStr, size, ingredient);
		return order;
	}
}
