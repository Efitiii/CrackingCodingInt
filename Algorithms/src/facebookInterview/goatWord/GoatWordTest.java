package facebookInterview.goatWord;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class GoatWordTest extends TestCase{
	
	@Test
	public void goatWordTest(){
		GoatWord goatWord= new GoatWord();
		System.out.println(goatWord.string_to_goat_latin("I speak Goat Latin"));		
	}

}
