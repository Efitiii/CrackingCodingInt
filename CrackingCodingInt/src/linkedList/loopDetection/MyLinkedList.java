package linkedList.loopDetection;

public class MyLinkedList {
	
	Node head;
	Integer size;
	
	MyLinkedList(){
		head= new Node(null, null, null);
		size=0;
	}
	
	public Integer getSize(){
		return size;
	}
	
	public void insertAfter(Node after, Node toBeInserted){
		
		after.next.prev=toBeInserted;
		toBeInserted.next=after.next;
		toBeInserted.prev=after;
		after.next=toBeInserted;
		
		
	}
	
	public void removeNode(Node toBeRemoved){
		if (toBeRemoved.next != null){
		toBeRemoved.next.prev=toBeRemoved.prev;
		toBeRemoved.prev.next=toBeRemoved.next;
		}
		else {
			toBeRemoved.prev.next=null;
		}
	}
	
	public void addNode(Integer value){
		
		Node next=head.next;
		
		if (head.next==null){
			head.next = new Node(value,head,null);
		}
		
		else {
			Node newNode= new Node(value,head,head.next);
			head.next.prev= newNode;
			head.next=newNode;
			
		}
		
	}
	
	public String toString(){
		
		StringBuilder str= new StringBuilder();
		Node next= head.next;
		
		if (next==null){
			return null;
		}
		
		else{
			while (next!=null){
				str.append(next.value.toString());
				str.append("->");
				next=next.next;
				
			}
		}
		
		return str.toString();
		
		
	}
	
	

}
