package hackerRank.balancedBrackets;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestBalancedBrackets extends TestCase{
	
	@Test
	public void balancedBrackets(){
		BalancedBrackets balanced= new BalancedBrackets();
		assertTrue(BalancedBrackets.isBalanced("{]()[}").equals("NO"));
		assertTrue(BalancedBrackets.isBalanced("{(([])[])[]}[]").equals("YES"));
		
	}

}
