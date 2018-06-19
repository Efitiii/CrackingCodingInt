package facebook.reverselinkedlist;

public class MyLinkedList {
	
	Node head;
	
	MyLinkedList(){
		head= new Node(null, null);
	}

	
public void add(String input){
	if (head.val==null){
		head.val=input;
	}
	
	else {
		Node newN= new Node (input, head);
		head=newN;	
	}
}


public void printLinkedList(){
	Node next=head;
	 System.out.println("");
	 System.out.println("****** New List ******");
	 System.out.println("");
	 while (next!=null){
		 System.out.print(next.val + "->"); 
		 next=next.next;
	 }
}
	
}
