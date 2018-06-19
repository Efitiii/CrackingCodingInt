package linkedList.removeDuplicates;


import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestRemoveDuplicates extends TestCase {
	
	//head->2->6->3->1
	@Test
	public void removeDuplicates(){
		MyLinkedList myList= new MyLinkedList();
		RemoveDuplicates removeD= new RemoveDuplicates();
		
		myList.addNode(2);
		myList.addNode(6);
		myList.addNode(1);
		myList.addNode(1);
		myList.addNode(3);
		
		MyLinkedList output=removeD.removeDuplicates(myList);
		
		System.out.println(output.toString());
		
		
		
	}

}
