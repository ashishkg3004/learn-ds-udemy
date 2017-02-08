package algo.recursion;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		
		int array[] = { 7, 9, 67, 12, 34, 54, 89, 99 };
		int startposition=4, elementToSearch=89;
		int index = recursiveLinearSearch(array, startposition, elementToSearch);
		
		if (index != -1) {
			System.out.println(elementToSearch + " Found at index: " + index);
		} else {
			System.out.println(elementToSearch + " not found in the array starting from position: " + startposition);
		}
	}

	public static int recursiveLinearSearch(int array[], int i, int x) {

		if (i > array.length-1) {
			return -1;
		} else if (array[i] == x) {
			return i;
		} else {
			System.out.println("current position: " + i);
			return recursiveLinearSearch(array, i + 1, x);
		}
	}

}
