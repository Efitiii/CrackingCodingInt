package implementation.stringbuilder;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class StringBuilderTester extends TestCase {
	
	@Test
	public void testStringBuilder(){
		StringBuilderImplementation str= new StringBuilderImplementation();
		String name= "Efrem";
		System.out.println(StringBuilderImplementation.appendString(name));
		
	}
	

}
