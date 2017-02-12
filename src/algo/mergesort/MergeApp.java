package algo.mergesort;

/*
 * Performs better than insertion and selection sort. Follows Divide and conquer
 * strategy. Complexities: O(n log n) Disadvantage: It makes complete copies of
 * array. Whereas Insertion and Selection were updating the same array. Merge
 * sort : Splitting then Merging. Splitting : The entire array is divided into
 * tiny single component and then two grouped into 2 sub-arrays which are
 * sorted. Merging: The Two sub-arrays are then compared element by element to
 * placed into the original array.
 */

public class MergeApp {

	public static void main(String[] args) {
		
		int inputArray[] = { 12, 9, 5, 87, 63, 78 };
		
		System.out.println("Original Array: ");
		System.out.print("[ ");
		for(int i = 0; i < inputArray.length; i++){
			System.out.print( inputArray[i] + " ");
		}
		System.out.print("]\n");
		
		MergeSort.sort(inputArray);
		
		System.out.println("Sorted Array: ");
		System.out.print("[ ");
		for(int i = 0; i < inputArray.length; i++){
			System.out.print( inputArray[i] + " ");
		}
		System.out.print("]");
	}
}
