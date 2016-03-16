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

//let's make a  grand Decaf Cappuccino
public class WhipCreamTest {
	WhipCream whipCream;
	Mockery context = new JUnit4Mockery() {{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	

	@Before
	public void setUp() throws Exception {
		final Decaf decaf = context.mock(Decaf.class);	
		context.checking(new Expectations() {
			{			
				allowing(decaf).getDescription();
				will(returnValue("Decaf"));
				allowing(decaf).cost();
				will(returnValue(1.8));//grand1.3+0.5
			}
		});
		whipCream = new WhipCream(decaf);
	}


	@Test
	public void testConstruction() {
		Assert.assertNotNull(whipCream);
	}
	
	@Test
	public void testCost() {
		
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(2.1, Double.parseDouble(df.format(whipCream.cost())), 0);
	}
	
	@Test
	public void testGetDescription() {
		Assert.assertEquals("Decaf whip", whipCream.getDescription());
	}
}
