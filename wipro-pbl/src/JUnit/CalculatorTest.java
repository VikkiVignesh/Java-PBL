package JUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void additionvalidation()
	{
		assertEquals(5,Calculator.add(3,2));
	}
	@Test
	void validatesub()
	{
		assertEquals(-2,Calculator.sub(-5,3));
	}

}
