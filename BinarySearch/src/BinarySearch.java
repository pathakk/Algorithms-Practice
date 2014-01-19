public class BinarySearch {

	static boolean search(int[] a, int i) {
		return search(a, i, 0, a.length - 1);

	}

	private static boolean search(int[] values, int element, int start, int end) {
		if (end < start)
			return false;

		int midPoint = start + ((end - start) / 2);

		if (values[midPoint] == element)
			return true;

		if (element < values[midPoint])
			return search(values, element, start, midPoint - 1);
		return search(values, element, midPoint + 1, end);

	}
}
