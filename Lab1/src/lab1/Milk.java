package lab1;

public class Milk extends BeverageWithIngredient {
	
    public Milk(Beverage drink) {
    	super(drink);
    	setCost(0.3);	
        description = drink.getDescription() + " Milk";
    }

  
}
