package lab1;

public class WhipCream extends BeverageWithIngredient {
    Beverage drink;

    public WhipCream(Beverage drink) {
        this.drink = drink;
        description = drink.getDescription() + " Whip";
    }

    public double cost() {
        return 0.3 + drink.cost();
    }
}
