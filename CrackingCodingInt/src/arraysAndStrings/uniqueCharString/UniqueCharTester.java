package arraysAndStrings.uniqueCharString;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class UniqueCharTester extends TestCase {
	
	@Test
	public void testUniqueChar(){
		UniqueChar unique= new UniqueChar();
		//assertFalse(unique.uniqueCharString("abcdezz"));
		assertTrue(unique.uniqueCharString("abcdez"));
	}

}
