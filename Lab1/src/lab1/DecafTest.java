package lab1;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecafTest {
	Decaf decaf;

	@Before
	public void setUp() throws Exception {
		decaf = new Decaf();
	}
	
	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("construction should not be null", decaf);
	}

	@Test
	public void testDescription() {
		Assert.assertEquals("Decaf", decaf.getDescription());
	}
	
	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		decaf.setSize("small");
		Assert.assertEquals(0.9, Double.parseDouble(df.format(decaf.cost())), 0);
		decaf.setSize("medium");
		Assert.assertEquals(1.2, Double.parseDouble(df.format(decaf.cost())), 0);
		decaf.setSize("large");
		Assert.assertEquals(1.5, Double.parseDouble(df.format(decaf.cost())), 0);
		decaf.setSize("grand");
		Assert.assertEquals(1.8, Double.parseDouble(df.format(decaf.cost())), 0);
	}

}
