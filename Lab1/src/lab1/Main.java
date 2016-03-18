package lab1;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		// get the input array and put it into disArr
		String[] disArr = new String[args.length];
		for (int j = 0; j < args.length; j++) {
			disArr[j] = args[j].toLowerCase();
		}
		// check if it contains a size command
		int i;
		String size = "";
		for (i = 0; i < disArr.length; i++) {
			if (disArr[i].equals("small") || disArr[i].equals("medium") || disArr[i].equals("large")) {
				size = disArr[i];
				break;
			}
		}

		if (i >= disArr.length) {
			System.out.println("Must set a size!");
			return;
		}
		// get the name of drink(maybe its length is 2)
		String beveStr;
		if (i == 2) {
			beveStr = disArr[0] + " " + disArr[1];
		} else {
			beveStr = disArr[0];
		}
		// get the ingredients
		String ingredients="";
		if (i < disArr.length) {
			for(int j = i+1;j<disArr.length;j++){
				ingredients += disArr[j]+ " ";
			}
		}

		// get the order instance
		BeverageFactory bf = new BeverageFactory();
		Shop shop = new Shop(bf);
		Beverage order = shop.orderBeverage(beveStr, size, ingredients);
		if (order == null) {
			return;
		}
		/**
		 * How do I get the description of each order instead of doing this
		 * stupid thing forever (except for printing the args)?
		 */
		/*if (order instanceof BeverageWithIngredient) {
			((BeverageWithIngredient) order).getDescription();
		} else if (order instanceof Espresso) {
			((Espresso) order).getDescription();
		}
		*/
		// and so on...
		//print the description
		System.out.println("The description of your order is: " + order.getDescription());

		// print the cost
		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: " + df.format(order.cost()));
	}

}