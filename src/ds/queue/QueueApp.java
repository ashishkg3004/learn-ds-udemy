package ds.queue;

public class QueueApp {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue(5);
		
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.insert(50);
		
		// Even if the size is exhausted it will still add. Circular Queue.
		
		myQueue.insert(9);
		myQueue.insert(99);
		myQueue.insert(999);
		myQueue.insert(9999);
		
		myQueue.view();
		
		System.out.println("--------------------------------");
		
		for(int i=0; i<5; i++){
			System.out.print(myQueue.remove());
			myQueue.view();
		}

	}

}
