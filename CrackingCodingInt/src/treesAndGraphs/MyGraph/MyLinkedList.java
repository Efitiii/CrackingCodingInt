package treesAndGraphs.MyGraph;

public class MyLinkedList {
	
	Integer value;
	Node head;
	Integer size;
	boolean visited;
	
	MyLinkedList (){
		head = new Node(null, null, null);
		size=0;
		visited=false;
		
	}
	
	public void add (Integer input){
		Node inputNode=new Node (input,head, head.next);
		
		// head->2->1->null  
		if (head.next!=null){
			head.next.prev=inputNode;
			inputNode.next=head.next;
			
		}
		
		head.next=inputNode;
	    size++;
	}
	
	public void remove (Integer toBeRemoved){
		Node next= head.next;
		boolean removed=false;
		while (next != null && removed==false){
			if (next.value.equals(toBeRemoved)){
				next.prev.next=next.next;
				if (next.next !=null){
				next.next.prev=next.prev;
				}
				removed=true;
				size--;
			}
			
			next=next.next;
		}
	}
	
	public Node findKthElement (Integer start){
		Node found=null;
		
		Node next= head.next;
		
		while (next!=null){
		if (next.value.equals(start)){
			found=next;
		}
		
		next=next.next;
		}
		
		return found;
	}
	
	
	public String toString(String separator){
		StringBuffer buffer= new StringBuffer();
	    Node next= head.next;
	    String output=null;
	    boolean insertedHead=false;
	    
	    if (next==null) return null;
	    
	    while (next!=null){
	    	
	    	if (head.value!=null && insertedHead==false){
	    		buffer.append(head.value+separator);
	    		insertedHead=true;
	    	}
	    
	    	buffer.append(next.value+separator);
	    	next=next.next;
	    	
	    }
	    
	    if (Character.toString(buffer.charAt(buffer.length()-1)).equals(Character.toString(separator.charAt(1)))){
	    	output=buffer.substring(0, buffer.length()-2);
	    }
		
		return output;	
	}
	
	
	public boolean checkIfNodeExists(Integer input){
		boolean exists=false;
		Node next=head.next;
		
		if (input.equals(null)){
			return false;
		}
		
		while (next != null && exists==false){
         if (next.value.equals(input)){
        	 exists=true;
         }
         
         next=next.next;
		}
		
		
		return exists;
	}
	
	
	
	class Node {
		Integer value;
		Node next;
		Node prev;
		
		Node (Integer value, Node prev, Node next){
			this.value=value;
			this.next=next;
			this.prev=prev;
		}
	}
	
	

}
