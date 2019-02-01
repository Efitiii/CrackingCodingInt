package arraysAndStrings.stringcompression;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class StringCompressionTest extends TestCase{
	
	@Test
	public void stringCompressionTest(){
		StringCompression str= new StringCompression();
		StringCompressionTrial2 str2= new StringCompressionTrial2();
		
		//assertTrue(str.compressString("aaaabbbcddaaa").equals("a4b3c1d2a3"));
		assertTrue(str2.compressString("aaaabbbcddaaaa").equals("a4b3c1d2a4"));
	}

}
