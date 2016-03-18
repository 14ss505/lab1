package test;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import lab1.Espresso;

public class EspressoTest extends TestCase {

	Espresso espresso;

	@Before
	public void setUp() throws Exception {
		espresso = new Espresso();
	}
	
	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("construction should not be null", espresso);
	}

	@Test
	public void testDescription() {
		Assert.assertEquals("Espresso", espresso.getDescription());
	}
	
	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		espresso.setSize("small");
		Assert.assertEquals(1.4, Double.parseDouble(df.format(espresso.cost())), 0);
		espresso.setSize("medium");
		Assert.assertEquals(1.7, Double.parseDouble(df.format(espresso.cost())), 0);
		espresso.setSize("large");
		Assert.assertEquals(2.0, Double.parseDouble(df.format(espresso.cost())), 0);
		espresso.setSize("grand");
		Assert.assertEquals(2.3, Double.parseDouble(df.format(espresso.cost())), 0);
	}


}
