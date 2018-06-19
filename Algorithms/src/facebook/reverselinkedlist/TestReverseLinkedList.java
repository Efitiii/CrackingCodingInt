package facebook.reverselinkedlist;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestReverseLinkedList extends TestCase {
	
	@Test
	public void reverseLinkedList(){
		
		MyLinkedList my= new MyLinkedList();
		my.add("D");
		my.add("C");
		my.add("B");
		my.add("A");
		
		my.printLinkedList();
		
		ReverseLinkedList toBeR= new ReverseLinkedList();
		toBeR.reverseLinkedList(my);
		
		my.printLinkedList();
		
		
	}

}
