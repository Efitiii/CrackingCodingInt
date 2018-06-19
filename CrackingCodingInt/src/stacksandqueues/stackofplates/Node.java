package stacksandqueues.stackofplates;

public class Node {
	
	Node prev;
	Node next;
	Integer val;
	
	Node(Integer val, Node prev, Node next){
		this.val=val;
		this.prev=prev;
		this.next=next;
	}

}
