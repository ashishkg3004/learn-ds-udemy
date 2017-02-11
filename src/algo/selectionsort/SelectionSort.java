package algo.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = selectionSort(new int[] { 12, 4, 16, 15, 26, 1 });
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static int[] selectionSort(int array[]) {
		int min;
		for (int i = 0; i < array.length - 1; i++) { // to traverse the entire element
			min = i;
			for (int j = i + 1; j < array.length; j++) { // for each iteration to get the lowest element index
				if (array[j] < array[min]) {
					min = j;
				}
			}
			// swap array[i] with array[min] to get the lowest index first which
			// is the minimum
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;

			// Display the array at the end of each iteration
			displayArray(array);
		}
		return array;
	}

	public static void displayArray(int array[]) {
		System.out.print("[ ");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.print(" ]\n");
	}
}
