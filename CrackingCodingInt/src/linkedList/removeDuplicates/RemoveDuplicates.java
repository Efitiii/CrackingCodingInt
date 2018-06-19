package linkedList.removeDuplicates;

public class RemoveDuplicates {
	
	// head(r)->3->1(n) ->2->2->4->3
	// head->1(r)->1(n)->4->5(r)->3(r)->6(P)(n)
	// 3->2
	
	public MyLinkedList removeDuplicates(MyLinkedList input){
		
		//Integer indexForward=1;
		//Integer indexReverse=0;
		boolean positionFound=false;
		Node next=input.head.next;
		Node reverse=input.head.next;
		Node nextPermanent;
		
		//head->3 ->1 ->6 ->2
		if (next==null){
			return input;
		}
		else if (next.next==null){
			return input;
		}
		nextPermanent=next.next;
		
		while (nextPermanent!=null ){
			next=nextPermanent;
			positionFound=false;
			reverse=next.prev;
			while (positionFound==false){
				
				if (reverse.value==null){
					nextPermanent=nextPermanent.next;
					input.removeNode(next);
					input.insertAfter(reverse,next);
					
					positionFound=true;
				}
				else
					
				if (next.value==reverse.value){
					nextPermanent=nextPermanent.next;
					input.removeNode(next);
					positionFound=true;
				}
				
					else{ 
						if (next.value>reverse.value){
						nextPermanent=nextPermanent.next;
						input.removeNode(next);
						input.insertAfter(reverse,next);
						positionFound=true;
					}
					}
				
				
				reverse=reverse.prev;
				
			}
			
			
		}
		
		
		return input;
		
	}

}
