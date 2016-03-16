package lab1;

public class Milk extends BeverageWithIngredient {
	Beverage drink;
	public Milk(Beverage drink) {
		this.drink = drink;
	}

	public double cost() {
		return 0.3 + drink.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+" Milk";
	}
}
