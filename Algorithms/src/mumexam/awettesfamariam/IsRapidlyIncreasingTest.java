package mumexam.awettesfamariam;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class IsRapidlyIncreasingTest extends TestCase {
	
	@Test
	public void testisRapidlyIncreasing(){
		
		IsRapidlyIncreasing isRapid= new IsRapidlyIncreasing();
		
		int[] arr1= new int[]{1,3,9,26};
		int[] arr2= new int[]{1,3,200,500};
		int[] arr3= new int[]{1};
		
		assertEquals(0,isRapid.isRapidlyIncreasing(arr1));
		assertEquals(1,isRapid.isRapidlyIncreasing(arr2));
		assertEquals(1,isRapid.isRapidlyIncreasing(arr3));

		System.out.println(Math.log(16)/Math.log(2));
		System.out.println('2'-'0');
		
	}
	

}
