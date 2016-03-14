package lab1;

import java.beans.Beans;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeBeverageTest {
	CoffeeBeverage coffeeBeverage;

	@Before
	public void setUp() throws Exception {
		coffeeBeverage = new CoffeeBeverage();
	}

	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("construction should not be null", coffeeBeverage);
		Assert.assertTrue(Beans.isInstanceOf(coffeeBeverage.sizeFactor, CoffeeBased.class));
	}
	
	@Test
	public void testSetSize() {
		coffeeBeverage.setSize("grand");
		Assert.assertEquals("Size", "grand", coffeeBeverage.size);
	}
	
	@Test
	public void testCost() {
		coffeeBeverage.setSize("small");
		Assert.assertEquals(0.4, coffeeBeverage.cost(), 0);
		coffeeBeverage.setSize("medium");
		Assert.assertEquals(0.7, coffeeBeverage.cost(), 0);
		coffeeBeverage.setSize("large");
		Assert.assertEquals(1.0, coffeeBeverage.cost(), 0);
		coffeeBeverage.setSize("grand");
		Assert.assertEquals(1.3, coffeeBeverage.cost(), 0);
	}

}
