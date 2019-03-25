package mumexam.awettesfamariam;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class EquivalentArraysTest extends TestCase {
	
	@Test
	public void equivalentArraysTest(){
		
		EquivalentArray equ= new EquivalentArray();
		
		int[] arr1= new int[]{3,1,2,0};
		int[] arr2= new int[]{0,2,1,3};
		
		assertEquals(1,equ.equivalentArray(arr1, arr2));
		
		
	}

}
