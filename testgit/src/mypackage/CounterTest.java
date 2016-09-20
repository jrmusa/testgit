package mypackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

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
