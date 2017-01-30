package ds.stack;

public class StackApp {

	public static void main(String[] args) {

		System.out.println("------------------------------");
		String stringToReverse = "Ashish";
		System.out.println("Reverse of " + stringToReverse + ": " + reverseString(stringToReverse));
		System.out.println("------------------------------");
	}

	// Application of our stack: Reverse a String 
	public static String reverseString(String str) {

		String reverse = "";
		Stack reverseStack = new Stack(6);

		for (int i = 0; i < str.length(); i++) {
			reverseStack.push(str.charAt(i));
		}

		while (!reverseStack.isEmpty()) {
			reverse += reverseStack.pop();
		}

		return reverse;

	}

}
