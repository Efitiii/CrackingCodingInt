package linkedList.returnKthToLast;

public class ReturnKthToLast {
	
	public Integer findKthToLast(Integer k){
		
		MySinglyLinkedList mySingly= new MySinglyLinkedList();
		mySingly.addToLink(0);
		mySingly.addToLink(1);
		mySingly.addToLink(2);
		mySingly.addToLink(3);
		mySingly.addToLink(4);
		
		return mySingly.findKth(k).getValue();
		
		
	}

}
