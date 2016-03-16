package lab1;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//let's make a large latte
public class MilkTest {
	Milk milk;
	Mockery context = new JUnit4Mockery() {{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	

	@Before
	public void setUp() throws Exception {
		final Espresso espresso = context.mock(Espresso.class);	
		context.checking(new Expectations() {
			{			
				allowing(espresso).getDescription();
				will(returnValue("Espresso"));
				allowing(espresso).cost();
				will(returnValue(2.0));//large1.0+1.0
			}
		});
		milk = new Milk(espresso);
	}


	@Test
	public void testConstruction() {
		Assert.assertNotNull(milk);
	}
	
	@Test
	public void testCost() {
		
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(2.3, Double.parseDouble(df.format(milk.cost())), 0);
	}
	
	@Test
	public void testGetDescription() {
		Assert.assertEquals("Espresso milk", milk.getDescription());
	}
	
}
