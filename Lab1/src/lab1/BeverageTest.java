package lab1;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeverageTest {
	Beverage beverage;
	
	@Before
	public void setUp() throws Exception {
		beverage = new Beverage();
	}

	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("Beverage construction should not be null", beverage);
	}
	
	@Test(timeout = 1000)
	public void testDescription() {
		beverage.setDescription("test beverage");
		Assert.assertEquals("Decaf description", "test beverage", beverage.getDescription());
	}
	
	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(0.0, Double.parseDouble(df.format(beverage.cost())), 0);
	}

}
