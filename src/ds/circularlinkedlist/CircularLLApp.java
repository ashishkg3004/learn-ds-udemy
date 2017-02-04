package ds.circularlinkedlist;

public class CircularLLApp {

	public static void main(String[] args) {
		
		CircularLinkedList myList = new CircularLinkedList();
		
		// insert in the beginning
		myList.insertFirst(10);
		myList.insertFirst(25);
		myList.insertFirst(35);
		myList.insertFirst(58);
		
		// insert at the last
		myList.insertLast(65);
		myList.insertLast(77);
		myList.insertLast(12);
		
		// display the list
		myList.displayList();

	}

}
