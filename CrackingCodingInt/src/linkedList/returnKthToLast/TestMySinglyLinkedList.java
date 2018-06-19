package linkedList.returnKthToLast;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestMySinglyLinkedList extends TestCase{
	
	@Test
	public void testMySinglyLinkedList(){
		
		ReturnKthToLast returnKthToLast= new ReturnKthToLast();
		assertTrue(returnKthToLast.findKthToLast(4) ==4);
		
	}

}
