package lab1;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//@RunWith(JMock.class)
public class BeverageWithIngredientTest {
	BeverageWithIngredient bIngredient;
	Mockery context = new JUnit4Mockery() {{
		setImposteriser(ClassImposteriser.INSTANCE);
	}};
	final Beverage drink = context.mock(Beverage.class);
	
	@Before
	public void setUp() throws Exception {
		bIngredient = new BeverageWithIngredient(drink);
		context.checking(new Expectations() {
			{
				oneOf(drink).cost();
				will(returnValue(0.0));//double
			}
		});
	}

	@Test
	public void testConstruction() {
		Assert.assertNotNull(bIngredient);
	}
	
	@Test
	public void testCost() {
		Assert.assertEquals(0, bIngredient.cost(), 0);
	}


}
