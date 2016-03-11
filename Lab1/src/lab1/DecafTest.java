package lab1;

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
		Assert.assertNotNull("DecafConstruction should not be null", decaf);
	}
	
	@Test(timeout = 1000)
	public void testGetDescription() {
		Assert.assertEquals("Decaf description", "Decaf", decaf.getDescription());
	}
	
	//todo: jmock
}
