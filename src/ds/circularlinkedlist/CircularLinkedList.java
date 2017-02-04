package ds.circularlinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList(){
		first = null;
		last = null;
	}
	
	// checks if the linked list is empty
	public boolean isEmpty(){
		return (first == null);
	}
	
	// insert in the beginning of the list
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			last = newNode;
		}
		newNode.next = first;  // newNode --> old first
		first = newNode;      // first place
	}
	
	// inserting at the end
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			first = newNode;
		}else{
			last.next = newNode; // the next value of the last node will point to the new node 
			last = newNode;		 // we make the new node we created be the last one in the list
		}
	}
	
	// delete the first element
	public int deleteFirst(){
		int temp = first.data;
		if(first.next == null){
			last = null;
		}
		
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

}

// In Circular LinkedList we can add elements in the beginning as well as at the end since we
// have references to both first and last element.
// In SinglyLinkedList, to insert the element at the last we need to traverse the entire list.
// We overcame that drawback here.
// Also we can use the circular LinkedList for implementing stack and queue.(**)