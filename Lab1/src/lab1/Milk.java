package lab1;

public class Milk extends BeverageWithIngredient {
    Beverage drink;

    public Milk(Beverage drink) {
        this.drink = drink;
        description = drink.getDescription() + " Milk";
    }

    public double cost() {
        return 0.3 + drink.cost();
    }

}
