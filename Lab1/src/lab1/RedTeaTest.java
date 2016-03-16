package lab1;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RedTeaTest {
	RedTea redTea;
	@Before
	public void setUp() throws Exception {
		redTea = new RedTea();
	}

	@Test
	public void testContruction() {
		Assert.assertNotNull("construction should not be null", redTea);
	}
	
	@Test
	public void testDescription() {
		Assert.assertEquals("Red Tea", redTea.getDescription());
	}

	@Test
	public void testCost() {
		DecimalFormat df = new DecimalFormat(".0");
		redTea.setSize("small");
		Assert.assertEquals(1.0, Double.parseDouble(df.format(redTea.cost())), 0);
		redTea.setSize("medium");
		Assert.assertEquals(1.3, Double.parseDouble(df.format(redTea.cost())), 0);
		redTea.setSize("large");
		Assert.assertEquals(1.5, Double.parseDouble(df.format(redTea.cost())), 0);
		redTea.setSize("grand");
		Assert.assertEquals(1.7, Double.parseDouble(df.format(redTea.cost())), 0);
	}
}
