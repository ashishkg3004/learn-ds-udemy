package ds.doublylinkedlist;

public class DoublyLLApp {

	public static void main(String[] args) {
		
		DoublyLinkedList myList = new DoublyLinkedList();
		
		myList.insertFirst(15);
		myList.insertFirst(25);
		myList.insertFirst(35);
		
		myList.insertLast(26);
		myList.insertLast(49);
		
		myList.displayForward();
		myList.displayBackward();
		
		myList.deleteFirst();
		myList.deleteLast();
		
		myList.displayForward();
		myList.displayBackward();
		
		myList.deleteKey(15);
		
		myList.displayForward();
		myList.displayBackward();
		
		myList.insertFirst(75);
		myList.insertFirst(65);
		
		myList.insertLast(56);
		myList.insertLast(59);
		
		myList.displayForward();
		myList.displayBackward();

	}

}
