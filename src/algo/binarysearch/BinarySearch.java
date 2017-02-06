package algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {

		// For Binary search the list must be sorted
		int sortedArray[] = { 1, 12, 26, 35, 42, 58, 68, 79, 81, 92 };
		int searchElement = 81;
		int index = binarySearch(sortedArray, searchElement);
		if (index != -1) {
			System.out.println(searchElement + " found at index: " + index);
		} else {
			System.out.println(searchElement + " is not found in the array");
		}
	}

	public static int binarySearch(int array[], int element) {

		int answer = -1;
		int start=0, end = array.length;

		while (start <= end) {

			int middle = (start + end) / 2;

			if (element == array[middle]) {
				answer = middle;
				return answer;
			}
			if (element < array[middle]) {
				end = (middle - 1);
				// binarySearch(array, element, start, end);
			} else if (element > array[middle]) {
				start = (middle + 1);
				// binarySearch(array, element, start, end);
			}
		}
		return answer;
	}

}
