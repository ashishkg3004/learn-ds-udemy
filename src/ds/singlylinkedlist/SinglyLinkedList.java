package ds.singlylinkedlist;

public class SinglyLinkedList {
	
	private Node first;
	
	public SinglyLinkedList(){
	}
	
	// check if the linked list is empty
	public boolean isEmpty(){
		return (first == null);
	}
	
	// used to insert at the beginning of the list. There is a diagram to explain. 
	// Note the first is a variable which points to some area in heap memory.
	// So newNode.next will point to where first was pointing and first will point to newNode.
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	// delete the first node
	public Node delete(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	// display the list
	public void displayList(){
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current!=null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	// used to insert element in the last
	public void insertLast(int data){
		Node current = first;
		while(current.next!=null){
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

}
