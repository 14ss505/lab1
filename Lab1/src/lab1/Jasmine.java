package lab1;

public class Jasmine extends BeverageWithIngredient {
	Beverage drink;
	public Jasmine(Beverage drink) {
		this.drink = drink;
	}

	public double cost() {
		return 0.5 + drink.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+" Jasmine";
	}
}
