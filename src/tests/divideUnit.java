package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideUnit {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_f = obj1.divide(10, 2);
		assertEquals(5, output_f);
	}

}
