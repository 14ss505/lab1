package lab1;

public class Ginger extends BeverageWithIngredient {
    
    public Ginger(Beverage drink) {
    	super(drink);
    	setCost(0.6);
        description = drink.getDescription() + " Ginger";
    }

}