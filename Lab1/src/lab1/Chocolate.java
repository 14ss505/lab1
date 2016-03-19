package lab1;

public class Chocolate extends BeverageWithIngredient {

    public Chocolate(Beverage drink) {
    	super(drink);
    	setCost(0.3);
        description = drink.getDescription() + " Chocolate";
    }

  
}
