package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class DecafTest extends TestCase {
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
		order1 = new Decaf();
		order2 = new CoffeeBeverage();
		order2 = new Decaf();
		order3 = new CoffeeBeverage();
		order3 = new Decaf();
		order4 = new CoffeeBeverage();
		order4 = new Decaf();
	}

	@Test(timeout = 1000)
	public void testDescription() {
		// decaf
		result = order1.getDescription();
		assertEquals("Decaf", result);
		// decaf+milk
		order2 = new Milk(order2);
		result = order2.getDescription();
		assertEquals("Decaf milk", result);
		// decaf+chocolate
		order3 = new Chocolate(order3);
		result = order3.getDescription();
		assertEquals("Decaf chocolate", result);
		// decaf+whipcream
		order4 = new WhipCream(order4);
		result = order4.getDescription();
		assertEquals("Decaf whip", result);
	}

	@Test(timeout = 1000)
	public void testCost() {
		// decaf small
		((CoffeeBeverage) order1).setSize("small");
		assertEquals(0.9, order1.cost());
		// decaf medium milk
		((CoffeeBeverage) order2).setSize("medium");
		order2 = new Milk(order2);
		assertEquals(1.5, order2.cost());
		// decaf large chocolate
		((CoffeeBeverage) order3).setSize("large");
		order3 = new Chocolate(order3);
		assertEquals(1.8, order3.cost());
		// decaf grand whipcream
		((CoffeeBeverage) order4).setSize("grand");
		order4 = new WhipCream(order4);
		assertEquals(2.1, order4.cost());
	}

	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("DecafConstruction should not be null", order1);
	}

}
