package stacksandqueues.stackofplates;

public class MyLinkedList {
	
	Node head;
	
	MyLinkedList(){
		this.head= new Node(null, null, null);
	}
	
	public void add(Integer val){
		Node next= head.next;
		if (next==null){
			Node newNode= new Node(val,head,null);
			head.next=newNode;
		}
		else{
			Node newNode=new Node(val,head,next);
			head.next=newNode;
			newNode.next.prev=newNode;
		}
	}
	
	
	public Integer getTopValue(){
		Integer output=0;
		Node next=head.next;
		if (next==null){
			return null;
		}
		
		output=next.val;
		
		return output;
	}
	
	
	public Integer removeTopValue(){
		Integer output=0;
		
		Node next=head.next;
		if (next==null){
			return null;
		}
		else{
			output=next.val;
			
			if (next.next==null){
				head.next=null;
			}
			else{
			head.next=next.next;
			next.next.prev=head;
			}
		}
		
		return output;
	}
	
	
	public String printLinkedList(Integer listNumber){
		Node next=head.next;
		Integer lenStr;
		
		StringBuilder str= new StringBuilder();
		if (next==null){
			str.append("List no."+listNumber+" is empty");
		}
		else{
			System.out.println("Printing listNumber: "+listNumber);
		while (next!=null){
			str.append(next.val+" =>");
			next=next.next;
		}
		}
	    
		lenStr= str.length();
		if (str.charAt(lenStr-1)=='>'){
		return	str.substring(0,lenStr-2);
		}
		
		return str.toString();
		
		
	}
	

}
