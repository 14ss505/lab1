package lab1;

public class WhipCream extends BeverageWithIngredient {
	
    public WhipCream(Beverage drink) {
    	super(drink);
    	setCost(0.3);
        description = drink.getDescription() + " Whip";
    }

  
}
