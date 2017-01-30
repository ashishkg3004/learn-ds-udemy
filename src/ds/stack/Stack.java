package ds.stack;

public class Stack {

	private int maxSize; // size of the stack
	private char[] stackArray; // Actual container which holds the stack
	private int top; // represent index position of stack

	// Initialize the stack with some size
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1; // since nothing is placed. After adding 1st element top
						// will point to 0.
	}

	// Push Operation
	public void push(char j) {
		if (isFull()) {
			System.out.println("the stack is already full");
		} else {
			top++;
			stackArray[top] = j;
		}
	}

	// Pop Operation
	public char pop() {
		if (isEmpty()) {
			System.out.println("the stack is empty");
			return '0'; // the is code smell. We just kind of added since the
						// method expects to return something.
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}

	// Peak Operation : Returns the element at the top of stack
	public char peak() {
		return stackArray[top];
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// Check if stack is full
	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
