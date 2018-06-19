package arraysAndStrings.isSubString;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class IsSubStringTest extends TestCase {
	
	@Test
	public void permutationStringTester(){
		IsSubString per= new IsSubString();
		assertTrue(per.findIfPermutation("cl", "abhabccl"));
	}

}
