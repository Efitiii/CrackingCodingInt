package linkedList.palindrome;

import org.junit.Test;

import junit.framework.TestCase;

public class TestPalindrome extends TestCase {

	
	@Test
	public void testPalindrome(){
		MyLinkedList mylink= new MyLinkedList();
		mylink.addNode('a');
		mylink.addNode('b');
		mylink.addNode('c');
		//mylink.addNode('d');
		mylink.addNode('c');
		mylink.addNode('b');
		mylink.addNode('a');
		
		Palindrome pal= new Palindrome();
		//assertTrue(pal.checkPalindrome(mylink));
		//assertFalse(pal.checkPalindrome(mylink));
		
	    //  assertTrue(pal.checkPalindromeByFastSlowRunnerTechnique(mylink));
	   //assertFalse(pal.checkPalindrome(mylink));
		
	   assertTrue(pal.checkPalindromeRecursion(mylink));
	   //assertFalse(pal.checkPalindrome(mylink));
		
	}
}
