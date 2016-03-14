package lab1;

public class Milk extends BeverageWithIngredient {
	public Milk(Beverage drink) {
		super(drink);
		this.setDescription(drink.getDescription()+ " milk");
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
