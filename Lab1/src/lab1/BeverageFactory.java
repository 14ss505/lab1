package lab1;

import java.util.Hashtable;

public class BeverageFactory {
	private Beverage order;

	public Beverage makeOrder(String beveStr, String size, String ingredient) {
		if (beveStr.equals("espresso")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
		} else if (beveStr.equals("houseblend")) {
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(size);
		} else if (beveStr.equals("decaf")) {
			order = new Decaf();
			((CoffeeBeverage) order).setSize(size);
		} else if (beveStr.equals("mocha")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
			order = new Chocolate(order);
		} else if (beveStr.equals("latte")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
			order = new Milk(order);
		} else if (beveStr.equals("cappuccino")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(size);
			order = new WhipCream(order);
		} else if (beveStr.equals("decaf mocha")) {// following 3 is the
			// addition
			order = new Decaf();
			((CoffeeBeverage) order).setSize(size);
			order = new Chocolate(order);
		} else if (beveStr.equals("decaf latte")) {
			order = new Decaf();
			((CoffeeBeverage) order).setSize(size);
			order = new Milk(order);
		} else if (beveStr.equals("decaf cappuccino")) {
			order = new Decaf();
			((CoffeeBeverage) order).setSize(size);
			order = new WhipCream(order);
		} else if (beveStr.equals("green tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(size);
		} else if (beveStr.equals("red tea")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(size);
		} else if (beveStr.equals("white tea")) {
			order = new WhiteTea();
			((TeaBeverage) order).setSize(size);
		} else if (beveStr.equals("flower tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(size);
			order = new Jasmine(order);
		} else if (beveStr.equals("ginger tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(size);
			order = new Ginger(order);
		} else if (beveStr.equals("tea latte")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(size);
			order = new Milk(order);
		} else {
			System.out.println("Illegal input: " + beveStr);
			order = null;
		}
		if (order != null) {
			String[] ingredients = ingredient.split(" ");
			for (int i = 0; i < ingredients.length; i++) {
				if (ingredients[i].equals("chocolate")) {
					order = new Chocolate(order);
				} else if (ingredients[i].equals("ginger")) {
					order = new Ginger(order);
				} else if (ingredients[i].equals("milk")) {
					order = new Milk(order);
				} else if (ingredients[i].equals("jasmine")) {
					order = new Jasmine(order);
				} else if (ingredients[i].equals("whip")) {
					order = new WhipCream(order);
				} else {
					System.out.println("Illegal input: " + ingredient);
					break;
				}
			}
		}
		return order;
	}
}
