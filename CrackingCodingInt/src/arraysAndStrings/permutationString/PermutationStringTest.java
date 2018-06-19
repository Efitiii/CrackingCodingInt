package arraysAndStrings.permutationString;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class PermutationStringTest extends TestCase {
	
	@Test
	public void testPermutationString(){
		
		PermutationString per= new PermutationString();
		String s="ab";
		//System.out.println(s.substring(0, 1));
		//System.out.println(s.substring(1, 1));
		assertTrue(per.sortString("ahcbbgf").equals("abbcfgh"));
		
	}

}
