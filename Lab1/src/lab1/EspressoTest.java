package lab1;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class EspressoTest extends TestCase {

	Beverage order1;
	Beverage order2;
	Beverage order3;
	Beverage order4;
	Milk milk;
	Chocolate choco;
	WhipCream wc;
	String result;

	@Before
	public void setUp() throws Exception {
		order1 = new CoffeeBeverage();
		order1 = new Espresso();
		order2 = new CoffeeBeverage();
		order2 = new Espresso();
		order3 = new CoffeeBeverage();
		order3 = new Espresso();
		order4 = new CoffeeBeverage();
		order4 = new Espresso();
	}

	@Test(timeout = 1000)
	public void testDescription() {
		// espresso
		result = order1.getDescription();
		assertEquals("Espresso", result);
		// espresso+milk
		order2 = new Milk(order2);
		result = order2.getDescription();
		assertEquals("Espresso milk", result);
		// espresso+chocolate
		order3 = new Chocolate(order3);
		result = order3.getDescription();
		assertEquals("Espresso chocolate", result);
		// espresso+whipcream
		order4 = new WhipCream(order4);
		result = order4.getDescription();
		assertEquals("Espresso whip", result);
	}

	@Test(timeout = 1000)
	public void testCost() {
		// espresso small
		DecimalFormat df = new DecimalFormat(".0");
		((CoffeeBeverage) order1).setSize("small");
		assertEquals(1.4, Double.parseDouble(df.format(order1.cost())));
		// espresso medium milk
		((CoffeeBeverage) order2).setSize("medium");
		order2 = new Milk(order2);
		assertEquals(2.0, Double.parseDouble(df.format(order2.cost())));
		// espresso large chocolate
		((CoffeeBeverage) order3).setSize("large");
		order3 = new Chocolate(order3);
		assertEquals(2.3, Double.parseDouble(df.format(order3.cost())));
		// espresso grand whipcream
		((CoffeeBeverage) order4).setSize("grand");
		order4 = new WhipCream(order4);
		order4.cost();
		assertEquals(2.6, Double.parseDouble(df.format(order4.cost())));
	}

	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("DecafConstruction should not be null", order1);
	}

}
