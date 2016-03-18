package test;

import java.text.DecimalFormat;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import lab1.Chocolate;
import lab1.Espresso;

public class ChocolateTest extends TestCase {
	Chocolate choco;
	Mockery context = new JUnit4Mockery() {{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};

	@Before
	public void setUp() throws Exception {
		final Espresso es = context.mock(Espresso.class);
		context.checking(new Expectations() {
			{			
				allowing(es).getDescription();
				will(returnValue("Espresso"));
				allowing(es).cost();
				will(returnValue(1.2));//small0.2+1.0
			}
		});
		choco = new Chocolate(es);
	}

	@Test
	public void testConstruction() {
		Assert.assertNotNull(choco);
	}
	
	@Test
	public void testCost() {
		
		DecimalFormat df = new DecimalFormat(".0");
		Assert.assertEquals(1.5, Double.parseDouble(df.format(choco.cost())), 0);
	}
	
	@Test
	public void testGetDescription() {
		Assert.assertEquals("Espresso Chocolate", choco.getDescription());
	}

}
