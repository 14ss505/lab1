package lab1;

public class Chocolate extends BeverageWithIngredient {
    Beverage drink;

    public Chocolate(Beverage drink) {
        this.drink = drink;
        description = drink.getDescription() + " Chocolate";
    }

    public double cost() {
        return 0.3 + drink.cost();
    }

}
