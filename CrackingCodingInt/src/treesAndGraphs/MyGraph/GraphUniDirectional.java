package treesAndGraphs.MyGraph;

public class GraphUniDirectional {
	
	MyLinkedList ver[];
	Integer sizeOfArray=10;
	boolean exists1=false;
	
	GraphUniDirectional () {
		this.ver = new MyLinkedList[sizeOfArray];
		
	}
	
	
	public boolean addNode(Integer start, Integer end){
		
    boolean nodeAdded=false;
    Integer count=0;
    MyLinkedList link;
    
    while (count<ver.length){
    	link=ver[count];
    	
    	link.findKthElement(start);
    }
    
    
    return nodeAdded;

}
	
	public void resize(Integer start){
		MyLinkedList[] temp= new MyLinkedList[start*2];
		System.arraycopy(ver, 0, temp, 0, ver.length);
		ver=temp;
	}
	
//	public boolean search (Integer input){
//		boolean exists=false;
//				
//		exists=checkForElement(ver[1],input);
//		
//		
//		return exists;
//	}
//	
//	public boolean checkForElement(MyLinkedList myLink, Integer input){
//	
//		
//		myLink.visited=true;
//		
//		if (myLink.value==input && myLink.visited==false){
//			return exists1=true;
//		}
//		
//		Node next= myLink.head.next;
//		
//		while (next!=null){
//			if (myLink.visited==false){
//			checkForElement (ver[next.value],input);
//			}
//			
//			next=next.next;
//		}
//		
//		return exists1;
//	}
	
	
	public String toString(String separator){
		
		StringBuffer buffer= new StringBuffer();
		
		for (int i=0; i<ver.length; i++){
			if (ver[i]!=null){
			buffer.append(ver[i].toString(separator) + "\n");
			}
		}
		
		return buffer.toString();
	}

}
