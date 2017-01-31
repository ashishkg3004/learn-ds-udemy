package ds.queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queueArray; // slots to hold the data
	private int front; // index position for elements in the front
	private int rear; // index position for elements at the back
	private int nItems; // counter to maintain the no of items in our queue

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; // index position for the first slot of array
		rear = -1; // there is no item in the array yet to be considered as the
					// last item
		nItems = 0; // we don't have items in the array yet
	}

	// Insert : Capability to insert items at the end
	public void insert(int j) {
		
		if(rear == maxSize-1){
			rear = -1;		// If max size is reached we are overriding the elements in the beginning. 
							// This concept is called Circular Queue.
		}
		rear++; // that's why we initialized it as '-1'
		queueArray[rear] = j;
		nItems++; // item is added so increment
	}
	
	//View: just a plain method to view the Queue
	public void view(){
		System.out.print("[ ");
		for(int i=0; i < queueArray.length ; i++){
			System.out.print(queueArray[i] + " ");
		}
		System.out.print(" ]");
	}
	
	//Remove: remove items from the front
	public long remove(){
		long temp = queueArray[front];
		front++;
		if(front == maxSize){
			front=0;  // we can set the front back to 0th index so that we can utilize the entire array again
		}
		return temp;
	}
	
	//Peek: get the front index element
	public long peekElement(){
		return queueArray[front];
	}
	
	// IsEmpty : Checks if queue is empty
	public boolean IsEmpty(){
		return (nItems == 0);
	}
	
	// IsFull : Checks if the queue is Full
	public boolean isFull(){
		return (nItems == maxSize);
	}

}