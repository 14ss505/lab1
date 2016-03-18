package test;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import lab1.GreenTea;

public class GreenTeaTest extends TestCase {
	GreenTea greenTea;
	@Before
	public void setUp() throws Exception {
		greenTea = new GreenTea();
	}

	@Test
	public void testContruction() {
		Assert.assertNotNull("construction should not be null", greenTea);
	}
	
	@Test
	public void testDescription() {
		Assert.assertEquals("Green Tea", greenTea.getDescription());
	}

	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		greenTea.setSize("small");
		Assert.assertEquals(1.2, Double.parseDouble(df.format(greenTea.cost())), 0);
		greenTea.setSize("medium");
		Assert.assertEquals(1.5, Double.parseDouble(df.format(greenTea.cost())), 0);
		greenTea.setSize("large");
		Assert.assertEquals(1.7, Double.parseDouble(df.format(greenTea.cost())), 0);
		greenTea.setSize("grand");
		Assert.assertEquals(1.9, Double.parseDouble(df.format(greenTea.cost())), 0);
	}
}
