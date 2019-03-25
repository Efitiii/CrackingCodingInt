package implementation.subString;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestIndexOfSubstring extends TestCase {
	
	@Test
	public void testSubString(){
		
		IndexOfSubstring indS= new IndexOfSubstring();
		assertTrue(indS.indexOfSubstring("mississippi", "issip")==4);
		
		
		
	}

}
