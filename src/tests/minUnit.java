package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class minUnit {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_f = obj1.min(9, 5);
		assertEquals(4, output_f);
	}

}
