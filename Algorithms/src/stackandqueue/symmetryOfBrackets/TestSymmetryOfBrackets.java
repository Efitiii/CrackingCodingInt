package stackandqueue.symmetryOfBrackets;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestSymmetryOfBrackets extends TestCase{
	
	@Test
	public void testIsSymmetric(){
		
		//String input1= "{{{}}}[]";
		String input1="{}[]<>}{{}}";
		SymmetryOfBrackets sym= new SymmetryOfBrackets();
		//assertTrue(sym.symmetryOfBrackets(input1));
		assertFalse(sym.symmetryOfBrackets(input1));
		
	}

}
