package algo.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] sortedArray = insertionSort(new int[] { 10, 25, 5, 68, 59, 48, 89, 35 });
		for(int i = 0; i < sortedArray.length; i++){
			System.out.print(sortedArray[i] + " ");
		}
	}

	public static int[] insertionSort(int a[]) {
		int element, j;
		// i set to 1. we assume 0th element as sorted group. The rest of the elements belongs to unsorted group.
		for (int i = 1; i < a.length; i++) {
			element = a[i];	  // element variable contains the data we intend to bring to the sorted section
			j = (i - 1);      // j always points to the last index of the sorted section
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
			displayArray(a);
		}
		return a;
	}

	private static void displayArray(int[] a) {
		System.out.print("[ ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.print(" ]\n");
	}

}
