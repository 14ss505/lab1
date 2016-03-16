package lab1;

public class Ginger extends BeverageWithIngredient {
	Beverage drink;
	public Ginger(Beverage drink) {
		this.drink = drink;
	}

	public double cost() {
		return 0.6 + drink.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+" Ginger";
	}
	
}