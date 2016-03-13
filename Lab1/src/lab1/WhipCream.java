package lab1;

public class WhipCream extends BeverageWithIngredient {
	public WhipCream(Beverage drink) {
		super(drink);
		description =drink.getDescription()+ " whip";
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
