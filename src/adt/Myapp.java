package adt;

public class Myapp {

	public static void main(String args[]) {

		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();

		System.out.println("Current Value of My Counter : " + myCounter.getCurrentValue());

	}

}
