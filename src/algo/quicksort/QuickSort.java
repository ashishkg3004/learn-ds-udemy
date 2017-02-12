package algo.quicksort;

/**
 * Follows divide and conquer strategy. Average running time: O(n log n).
 * Worst-case : O(n^2) Merge sort worst-case: O(n log n). Why do we prefer quick
 * sort over merge sort when though the worst-case of merge sort is better.
 * Because quick sort sorts elements in the array in place instead of creating
 * new arrays in merge sort. So if application has space constraints we go for
 * quick sort else merge sort. The heart of quick sort is part partitioning
 * unlike merge which was merging! Partitioning here gives a guarantee that till
 * the pivot index the elements are sorted. The complexity of this algo depends
 * upon the pivot element being chosen. In our case we are choosing the last
 * element to be the pivot. Also called as partition sort.
 */

public class QuickSort {

	public static void main(String[] args) {
		int inputArray[] = new int[] { 55, 10, 34, 28, 5, 78, 68, 43 };
		System.out.println("Original Array: ");
		System.out.print("[ ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.print("]\n");

		// call the quick sort algorithm
		quickSort(inputArray, 0, inputArray.length - 1);

		System.out.println("Sorted Array: ");
		System.out.print("[ ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.print("]");
	}

	private static void quickSort(int[] inputArray, int start, int end) {
		if (start < end) {
			// Get the partition point.
			// Index position of the correctly placed value in array
			int pp = partition(inputArray, start, end);
			// sorts the left half of the range
			quickSort(inputArray, start, (pp - 1));
			// sorts the right half of the range
			quickSort(inputArray, (pp + 1), end);
		}
	}

	// This is the heart of the algorithm to get the pivot point
	private static int partition(int[] inputArray, int start, int end) {

		// we assume the last element as pivot
		int pivot = inputArray[end];

		// in the first iteration i starts from -1;
		int i = (start - 1);
		for (int j = start; j < end - 1; j++) {
			if (inputArray[j] <= pivot) {
				i++;
				// we need to swap
				int ival = inputArray[i];
				int jval = inputArray[j];
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
		}

		// Till here all the element to the left of partition will be sorted
		// put the pivot value in the correct slot
		int ival = inputArray[i + 1];
		inputArray[end] = ival;
		inputArray[i + 1] = pivot;

		return (i + 1);
	}

}