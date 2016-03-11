package test;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Beverage;
import lab1.CoffeeBeverage;
import lab1.Decaf;

public class DecafTest {
	Beverage order;

	@Before
	public void setUp() throws Exception {
		order = new CoffeeBeverage();
		order = new Decaf();
	}

	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("DecafConstruction should not be null", order);
	}

	@Test(timeout = 1000)
	public void testGetDescription() {
		Assert.assertEquals("Decaf description", "Decaf", order.getDescription());
	}

	@Test(timeout = 1000)
	public void testCost(){
		((CoffeeBeverage) order).setSize("small");
		Assert.assertEquals(0.9, order.cost(),0);
		((CoffeeBeverage) order).setSize("medium");
		Assert.assertEquals(1.2, order.cost(),0);
		((CoffeeBeverage) order).setSize("large");
		Assert.assertEquals(1.5, order.cost(),0);
		//if we have the size grant
		//((CoffeeBeverage) order).setSize("grant");
		//Assert.assertEquals(1.8, order.cost(),0);
	}
	
}
