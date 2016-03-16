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

//let's make a medium flower tea~
public class JasmineTest {
	Jasmine jasmine;
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
				will(returnValue(1.5));//medium0.5+1.0
			}
		});
		jasmine = new Jasmine(greenTea);
	}

	@Test
	public void testConstruction() {
		Assert.assertNotNull(jasmine);
	}
	
	@Test
	public void testCost() {
		
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(2.0, Double.parseDouble(df.format(jasmine.cost())), 0);
	}
	
	@Test
	public void testGetDescription() {
		Assert.assertEquals("Green Tea jasmine", jasmine.getDescription());
	}
}
