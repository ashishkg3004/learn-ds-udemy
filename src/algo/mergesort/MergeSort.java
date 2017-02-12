package algo.mergesort;

public class MergeSort {

	// Divide the array into 2 equals half which then will be called recursively
	// to form the tiny bits
	public static void sort(int inputArray[]) {
		sort(inputArray, 0, inputArray.length - 1);
	}

	// continue to divide till we get tiny one element in each component.
	public static void sort(int inputArray[], int start, int end) {

		if (end <= start) {
			return; // we're done traversing.
		}

		int mid = (start + end) / 2;
		sort(inputArray, start, mid); // sort left half entirely
		sort(inputArray, mid + 1, end); // sort right half entirely
		// after this step we have tiny bits single component array
		merge(inputArray, start, mid, end); // merge sorted results into
											// inputArray
	}

	public static void merge(int inputArray[], int start, int mid, int end) {

		int tempArray[] = new int[end - start + 1];

		// index counter for the left side of the array
		int leftSlot = start;
		// index counter for the right side of the array
		int rightSlot = mid + 1;
		// index variable for inserting into the inputArray
		int k = 0;

		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}

		/**
		 * When it gets here, the loop is complete. Both the left and right
		 * sub-arrays can be considered sorted.
		 */
		if (leftSlot <= mid) { // consider the right side done being sorted.
								// Left must be sorted already
			while (leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) { // consider the left side being sorted.
										// Right must be sorted already
			while (rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}

		// copy the temp array to the appropriate input Array.
		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
	}
}
