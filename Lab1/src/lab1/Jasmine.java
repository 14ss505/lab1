package lab1;

public class Jasmine extends BeverageWithIngredient {

    public Jasmine(Beverage drink) {
    	super(drink);
    	setCost(0.5);
        description = drink.getDescription() + " Jasmine";
    }

    
}
