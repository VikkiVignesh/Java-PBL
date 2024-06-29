package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSort {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void comparearr()
	{
		Sort s=new Sort();
		int a[]= {1,2,3,4,5,6};
		int b[]= {5,1,2,4,3,6};
		assertArrayEquals(a,s.arrange(b));
	}

}
