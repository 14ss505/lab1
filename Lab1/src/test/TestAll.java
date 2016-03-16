package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {
	public static Test suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(ChocolateTest.class);
		suite.addTestSuite(CoffeeBasedTest.class);
		suite.addTestSuite(DecafTest.class);
		suite.addTestSuite(EspressoTest.class);
		suite.addTestSuite(GingerTest.class);
		suite.addTestSuite(GreenTeaTest.class);
		suite.addTestSuite(HouseBlendTest.class);
		suite.addTestSuite(JasmineTest.class);
		suite.addTestSuite(MilkTest.class);
		suite.addTestSuite(RedTeaTest.class);
		suite.addTestSuite(TeaBasedTest.class);
		suite.addTestSuite(WhipCreamTest.class);
		suite.addTestSuite(WhiteTeaTest.class);
		return suite;
	}
}

