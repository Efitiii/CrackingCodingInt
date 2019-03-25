package mumexam.awettesfamariam;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class IsOnionTest extends TestCase{
	
	@Test
	public void isOnionTest(){
		
		IsOnionArray isOnion= new IsOnionArray();
		int[] arr1= new int[]{1,2,19,4,5};
		int[] arr2= new int[]{1,3,9,8};
		int[] arr3= new int[]{};
		int[] arr4= new int[]{2};
		
		assertEquals(1, isOnion.isOnionArray(arr1));
		assertEquals(0, isOnion.isOnionArray(arr2));
		assertEquals(1, isOnion.isOnionArray(arr3));
		assertEquals(1, isOnion.isOnionArray(arr4));
	}

}
