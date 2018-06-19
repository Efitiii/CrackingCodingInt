package linkedList.returnKthToLast;

public class MySinglyLinkedList {
	
	Node head;
	Integer size;
	
	
	MySinglyLinkedList(){
		this.head= new Node(null,null);
		this.size=0;
		
	}

public Node getHead(){
	
	return head;
}

public void addToLink(Integer value){
	Node next= this.head.next;
	if (next==null){
		head.next=new Node(null,value);
		size++;
	}
	
	else{
		
		Node newNode= new Node (next, value);
		this.head.next=newNode;
		size++;
		
		
		
	}
	
}

public Node findKth(Integer k){
	//0....8 / k=3 4/ size= 9 / return 4th count= size-k
	//  8 7 6 5 4 
	Integer count=size-1-k;
	Node next= this.head.next;
	if (next==null || k>size){
		return head;
	}
	else {
		while (count>1){
			next=next.next;
			count--;	
		}
		
		return next;
	}
	
}




}
