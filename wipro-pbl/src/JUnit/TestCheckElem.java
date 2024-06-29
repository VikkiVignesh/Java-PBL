package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckElem {

	@Test
	void check()
	{
		CheckElem ch=new CheckElem();
		int a[]= {10,20,30,40,50,60,70};
		assertTrue(ch.present(a, 10));
	}
}
