package facebook.reverselinkedlist;


// null <-A <-B <- C  null -> D -> null
// A->B->C->D->null
// D->C->B->A->null

public class ReverseLinkedList {
	
public void	reverseLinkedList(MyLinkedList in){
		
	if (in.head.val==null){
		System.out.println("LinkedList is Empty");
	}
	
	Node current= in.head;// A
	
	if (current.next!=null){
		Node next=current.next;//B
		
		current.next=null;
		Node temp= next.next;//C
		next.next=current;// 
		current=next;//B
		next=temp;//C
		
		while (next!=null){
			temp=next.next;//null
			next.next=current;
			current=next;//C
			next=temp;	//null
		}
		
		in.head=current;
	}
	else {
		System.out.println("Linked List is the current List");
	}
	
	}

}
