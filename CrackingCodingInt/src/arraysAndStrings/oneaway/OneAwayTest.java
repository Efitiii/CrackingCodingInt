package arraysAndStrings.oneaway;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class OneAwayTest extends TestCase {
	
	@Test
	public void isOneAwayTest(){
		OneAway oneA= new OneAway();
		assertTrue(oneA.checkOneAway("pale", "bale"));
	}

}
