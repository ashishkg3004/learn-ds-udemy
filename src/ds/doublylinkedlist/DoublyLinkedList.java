package ds.doublylinkedlist;

import java.util.Currency;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	// checks to see if the list is empty
	public boolean isEmpty() {
		return (first == null);
	}

	// insert the elements in the beginning
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode; // if empty last will refer to the new node being
							// created.
		} else {
			first.previous = newNode;
		}

		newNode.next = first; // the new node's next field will point to the old
								// first
		this.first = newNode;
	}

	// insert the data at the end
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // assigning old last to new node.
			newNode.previous = last; // the old last will be the new node
										// previous
		}
		last = newNode; // the linkedlist's last field should point to the new
						// node.
	}

	// assume that the list is non-empty
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) { // there is only one item in list
			last = null;
		} else {
			first.next.previous = null; // the list's first node will point to
										// null.
		}

		first = first.next;
		return temp;
	}

	// assume the list is non-empty
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) { // there is only one item in the list
			first = null;
		} else {
			last.previous.next = null; // the list's second last node will point
										// to null
		}
		last = last.previous;
		return temp;
	}

	// assume the list is non-empty
	// inserting a new node after a particular value in the list
	// key: value after which we need to insert the new node
	// value: the actual value which we need to insert at the new node
	public boolean insertAfter(int key, int data) {

		Node current = first; // we'll start from the beginning of the list

		while (current.data != key) { // as long as we haven't found the key in
										// the last
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		if (current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next; // new node's next should point to the
											// node ahead of the current one
			current.next.previous = newNode; // the node ahead of current, it's
												// previous should point to new
												// node
		}

		newNode.previous = current;
		current.next = newNode;

		return true;
	}

	// assume the list is non-empty
	public Node deleteKey(int key) {
		Node current = first; // start from the beginning

		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}

		if (current == first) {
			first = current.next; // make the first field point to current's
									// next since current will be deleted
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}

		return current;
	}

	// display the list forward
	public void displayForward() {
		System.out.print("List (first --> last ): ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	// display the list backward
	public void displayBackward() {
		System.out.print("List (last --> first ): ");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}

}