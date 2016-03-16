package lab1;

public class Jasmine extends BeverageWithIngredient {
    Beverage drink;

    public Jasmine(Beverage drink) {
        this.drink = drink;
        description = drink.getDescription() + " Jasmine";
    }

    public double cost() {
        return 0.5 + drink.cost();
    }
}
