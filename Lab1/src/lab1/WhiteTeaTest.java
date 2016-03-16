package lab1;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiteTeaTest {
	WhiteTea whiteTea;
	@Before
	public void setUp() throws Exception {
		whiteTea = new WhiteTea();
	}

	@Test
	public void testContruction() {
		Assert.assertNotNull("construction should not be null", whiteTea);
	}
	
	@Test
	public void testDescription() {
		Assert.assertEquals("White Tea", whiteTea.getDescription());
	}

	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		whiteTea.setSize("small");
		Assert.assertEquals(1.2, Double.parseDouble(df.format(whiteTea.cost())), 0);
		whiteTea.setSize("medium");
		Assert.assertEquals(1.5, Double.parseDouble(df.format(whiteTea.cost())), 0);
		whiteTea.setSize("large");
		Assert.assertEquals(1.7, Double.parseDouble(df.format(whiteTea.cost())), 0);
		whiteTea.setSize("grand");
		Assert.assertEquals(1.9, Double.parseDouble(df.format(whiteTea.cost())), 0);
	}
}
