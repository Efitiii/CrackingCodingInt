package linkedList.returnKthToLast;


public class Node{
	
	Node next;
	Integer value;
	
	Node(Node next, Integer value){
		this.next=next;
		this.value=value;
		
	}
	
	public Integer getValue(){
		return this.value;
	}
}
