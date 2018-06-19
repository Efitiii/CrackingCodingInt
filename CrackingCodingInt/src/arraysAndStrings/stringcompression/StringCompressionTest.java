package arraysAndStrings.stringcompression;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class StringCompressionTest extends TestCase{
	
	@Test
	public void stringCompressionTest(){
		StringCompression str= new StringCompression();
		
		assertTrue(str.compressString("aaaabbbcddaaa").equals("a4b3c1d2a3"));
	}

}
