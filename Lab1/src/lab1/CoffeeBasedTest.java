package lab1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeBasedTest {
	SizeFactor sf;

	@Before
	public void setUp() throws Exception {
		double[] prices = { 0.4, 0.7, 1.0, 1.3 };	
		sf = new SizeFactor(prices);
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		Assert.assertEquals(0.4, sf.sizeCost("small"), 0);
		Assert.assertEquals(0.7, sf.sizeCost("medium"), 0);
		Assert.assertEquals(1.0, sf.sizeCost("large"), 0);
		Assert.assertEquals(1.3, sf.sizeCost("grant"), 0);
	}

}
