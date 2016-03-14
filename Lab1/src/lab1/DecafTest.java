package lab1;

import org.jmock.integration.junit4.JUnitRuleMockery;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DecafTest {
	Decaf decaf;
	@Rule 
	public JUnitRuleMockery context = new JUnitRuleMockery();

	@Before
	public void setUp() throws Exception {
		decaf = new Decaf();
//		final 
	}

	@Test(timeout = 1000)
	public void testConstruction() {
		Assert.assertNotNull("DecafConstruction should not be null", decaf);
	}
	
	@Test(timeout = 1000)
	public void testGetDescription() {
		Assert.assertEquals("Decaf description", "Decaf", decaf.getDescription());
	}
	
	//todo: jmock testCost   mock CoffeeBase
	@Test
	public void testCost() {
		
	}
}
