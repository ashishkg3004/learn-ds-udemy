package ds.linkedlists;

public class NodeApp {

	public static void main(String[] args) {
		
		Node nodeA = new Node();
		Node nodeB = new Node();
		Node nodeC = new Node();
		Node nodeD = new Node();
		
		nodeA.data = 4 ;
		nodeA.next = nodeB;
		
		nodeB.data = 3 ;
		nodeB.next = nodeC;
		
		nodeC.data = 5 ;
		nodeC.next = nodeD;
		
		nodeD.data = 7 ;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
	}
	
	public static int listLength(Node node){
		int len=0;
		while(node!=null){
			len++;
			node = node.next;
		}
		return len;
	}

}
