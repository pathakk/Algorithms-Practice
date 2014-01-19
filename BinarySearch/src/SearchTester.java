import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SearchTester {
	int[] a;

	@Before
	public void setUp() throws Exception {
		a = new int[19];
		int currIndex = 0;

		// Create the test array from [-10,10]
		for (int i = -10; i <= 10; i++) {
			if (i == 6) // Skip 6 so we can test a non-existent value in the
						// middle
				continue;
			if (i == -3) // Same as above but for a negative value
				continue;
			a[currIndex] = i;
			currIndex++;

		}

	}

	@Test
	public void testBinarySearch() {

		// Test values within the middle areas of the array
		assertEquals(BinarySearch.search(a, 5), true);
		assertEquals(BinarySearch.search(a, -4), true);

		// Test existing values on both boundaries
		assertEquals(BinarySearch.search(a, -10), true);
		assertEquals(BinarySearch.search(a, 10), true);

		// Test non-existent values on both boundaries
		assertEquals(BinarySearch.search(a, -20), false);
		assertEquals(BinarySearch.search(a, 20), false);

		// Test non-existent values in middle of Array
		assertEquals(BinarySearch.search(a, -3), false);
		assertEquals(BinarySearch.search(a, 6), false);
	}

}
