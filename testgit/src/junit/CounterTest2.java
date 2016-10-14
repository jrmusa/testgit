package junit;

import static org.junit.Assert.*;
import org.junit.Test;

import mypackage.Counter;

public class CounterTest2 {

	@Test
	public void testAdd() {
		Counter c = new Counter();
		assertEquals(3, c.add(1, 2));
	}

	@Test
	public void testSubtract() {
		Counter c = new Counter();
		assertEquals(1, c.subtract(2, 1));
	}

}
