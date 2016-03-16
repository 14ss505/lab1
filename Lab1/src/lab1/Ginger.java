package lab1;

public class Ginger extends BeverageWithIngredient {
    Beverage drink;

    public Ginger(Beverage drink) {
        this.drink = drink;
        description = drink.getDescription() + " Ginger";
    }

    public double cost() {
        return 0.6 + drink.cost();
    }

}