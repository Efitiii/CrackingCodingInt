package recursionanddynamicprogramming;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestStairCaseHop extends TestCase{
	
	@Test
	public void testStairCaseHop(){
		StairCaseHop stairHop= new StairCaseHop();
		//assertTrue(stairHop.countNumberOfSteps(1,2,3,6)==12);
		//System.out.println(stairHop.countNumberOfSteps(1, 2, 3, 20));
		
		System.out.println(stairHop.computeCombinationOfSteps(5, 3));
		
	}

}
