package algo.recursion;

public class RecursiveBinarySearch {

	public static void main(String[] args) {

		int array[] = { 1, 15, 24, 26, 56, 75, 82, 96 };
		int start = 2, end = 6, element = 75, index;
		index = recursiveBinarySearch(array, start, end, element);
		if (index != -1) {
			System.out.println(element + " found at index " + index);
		} else {
			System.out.println(element + " not found in the array between postion " + start + " and " + end);
		}
	}

	private static int recursiveBinarySearch(int[] array, int start, int end, int element) {
		System.out.println("[ " + start + "..." + end + " ]"); // Good line to print the boundaries...
		if (start > end) {
			return -1;
		} else {
			int middle = (start + end) / 2;
			if (array[middle] == element) {
				return middle;
			} else if (element < array[middle]) {
				return recursiveBinarySearch(array, start, (middle - 1), element);
			} else {
				return recursiveBinarySearch(array, (middle + 1), end, element);
			}
		}
	}
}