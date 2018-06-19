package arraysAndStrings.palindrome;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase{
	
	@Test
	public void testPalindrome(){
		
		Palindrome pali= new Palindrome();
		//assertTrue(pali.findIfPermutationOfPalindrome("abh t cd abhcd"));
		
		PalindromeBitManipulation pali2= new PalindromeBitManipulation();
		assertTrue(pali2.checkIfPalindrome("abh  cd abghcd"));
	}

}
