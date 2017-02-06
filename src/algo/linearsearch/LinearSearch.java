package algo.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {

		int linearArray[] = { 10, 50, 23, 63, 58, 96, 57 };
		int searchElement = 59;
		int index = linearSearch(linearArray, searchElement);
		if (index != -1) {
			System.out.println("Index of " + searchElement + " is " + index);
		} else {
			System.out.println(searchElement + " cannot be found in the array");
		}
	}

	public static int linearSearch(int array[], int element) {

		int answer = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				answer = i;
				break;
			}
		}
		return answer;
	}

}

// Considering the Worst Case Scenario, this algorithm scales Linearly.
// The Complexity of linear search : O(n) [n: input size]