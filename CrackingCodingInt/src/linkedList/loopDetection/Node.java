package linkedList.loopDetection;

public class Node {
	
	Node prev;
	Node next;
	Integer value;
	
	Node(Integer value, Node prev, Node next){
		this.value=value;
		this.prev=prev;
		this.next=next;
		
	}

}
