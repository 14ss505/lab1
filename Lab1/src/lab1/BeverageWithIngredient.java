package lab1;

public abstract class BeverageWithIngredient extends Beverage {
	protected Beverage drink;
	
	// add constructor
	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	}
		
    //generalize cost() from subclasses 
	public double cost() {
		return cost + drink.cost();
	}
}
