package lab1;

import static org.junit.Assert.*;

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
	public void testCost() {
		
	}

}
