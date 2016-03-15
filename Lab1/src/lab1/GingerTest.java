package lab1;

import java.text.DecimalFormat;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//let's make a small ginger tea~
public class GingerTest {
	Ginger ginger;
	Mockery context = new JUnit4Mockery() {{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	

	@Before
	public void setUp() throws Exception {
		final GreenTea greenTea = context.mock(GreenTea.class);	
		context.checking(new Expectations() {
			{			
				allowing(greenTea).getDescription();
				will(returnValue("Green Tea"));
				allowing(greenTea).cost();
				will(returnValue(1.2));//small0.2+1.0
			}
		});
		ginger = new Ginger(greenTea);
	}


	@Test
	public void testConstruction() {
		Assert.assertNotNull(ginger);
	}
	
	@Test
	public void testCost() {
		
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(1.8, Double.parseDouble(df.format(ginger.cost())), 0);
	}
	
	@Test
	public void testGetDescription() {
		Assert.assertEquals("Green Tea ginger", ginger.getDescription());
	}
	

}
