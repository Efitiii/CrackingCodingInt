package mathAndLogicPuzzles.findPrimeNumber;

import java.util.ArrayList;


import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestFindPrimeNumber extends TestCase {

	@Test
	public void testPrime(){
		FindPrimeNumber find= new FindPrimeNumber();
		ArrayList<Integer> primes=(ArrayList<Integer>) find.findAllPrime(7);
		
		for(Integer i:primes){
			System.out.println(i);
		}
		
	}
}
