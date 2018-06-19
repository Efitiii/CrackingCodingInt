package stacksandqueues.threestacks;

public class Node {
	
	Integer value;
	Node next;
	Node prev;
	
	Node (Integer value, Node prev, Node next){
		this.value=value;
		this.prev=prev;
		this.next=next;
	}

}
