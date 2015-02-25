package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator bc = new MyCalculator();
		int actual = bc.nfactorial(-2);
		
		assertEquals("-2 = -1", -1, actual, 0.0);
		
	}

	@Test
	public void testBinarySearch() {
		
		int [] array = {1, 2, 3, 4, 5};
		MyCalculator b = new MyCalculator();
		int actual = b.binarySearch(array, 0);
		
		assertEquals("position:0", -1, actual, 0.0);
	}

}
