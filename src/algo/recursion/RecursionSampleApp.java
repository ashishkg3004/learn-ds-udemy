package algo.recursion;

public class RecursionSampleApp {

	public static void main(String[] args) {
		reduceByOne(10);
	}

	public static void reduceByOne(int n) {
		if (n >= 0) {
			reduceByOne(n - 1);
		}
		System.out.println("Complete Call Stack : " + n);
	}
}

// Refer to recursive-call-stack.png for the output.