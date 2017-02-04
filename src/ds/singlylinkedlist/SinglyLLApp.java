package ds.singlylinkedlist;

public class SinglyLLApp {

	public static void main(String[] args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		
		// the elements are inserted in the beginning every time...
		myList.insertFirst(50);
		myList.insertFirst(55);
		myList.insertFirst(74);
		myList.insertFirst(95);
		
		// the elements are inserted last
		myList.insertLast(15);
		myList.insertLast(26);
		
		// display the list
		myList.displayList();

	}

}
