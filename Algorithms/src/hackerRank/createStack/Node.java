package hackerRank.createStack;


public class Node{
    Integer value;
    Node prev;
    Node next;
    
    Node (Integer value, Node prev, Node next){
        this.prev=prev;
        this.next=next;
        this.value=value;
    }
    
    public static Node getInstance(Integer value, Node prev, Node next){
    	return new Node(value,prev,next);
    }

	public Integer getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public Node getNext() {
		return next;
	}
    
    
    
    
    
}
