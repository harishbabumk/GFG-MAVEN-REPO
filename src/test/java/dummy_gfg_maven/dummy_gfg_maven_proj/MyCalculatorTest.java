package dummy_gfg_maven.dummy_gfg_maven_proj;

import org.junit.Test;

import demo.MyCalculator;
import junit.framework.TestCase;

public class MyCalculatorTest extends TestCase {
	MyCalculator calc = new MyCalculator();
	
	@Test
	public void testSum() {
		assertEquals(15, calc.sum(5, 10));
	}
	
	@Test
	public void testDiff() {
		assertEquals(8, calc.diff(10, 2));
	}
}
