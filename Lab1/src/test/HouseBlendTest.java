package test;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import lab1.HouseBlend;

public class HouseBlendTest extends TestCase{
	HouseBlend hb;
	
	@Before
	public void setUp() throws Exception {
		hb = new HouseBlend();
	}

	@Test
	public void testContruction() {
		Assert.assertNotNull("construction should not be null", hb);
	}
	
	@Test
	public void testDescription() {
		Assert.assertEquals("HouseBlend", hb.getDescription());
	}

	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		hb.setSize("small");
		Assert.assertEquals(1.2, Double.parseDouble(df.format(hb.cost())), 0);
		hb.setSize("medium");
		Assert.assertEquals(1.5, Double.parseDouble(df.format(hb.cost())), 0);
		hb.setSize("large");
		Assert.assertEquals(1.8, Double.parseDouble(df.format(hb.cost())), 0);
		hb.setSize("grand");
		Assert.assertEquals(2.1, Double.parseDouble(df.format(hb.cost())), 0);
	}
}
