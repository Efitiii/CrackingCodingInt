package sortingandsearching.peaksAndValleys;



import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TestPeaksAndValleys extends TestCase {
	
	@Test
	public void testPeakAndValleys(){
		
		PeaksAndValleys peaksAndVa= new PeaksAndValleys();
		
		Integer[] input= new  Integer[]{5,8,6,2,3,4,6};
		Integer[] output=peaksAndVa.sortInPeaksValleys(input);
		Integer[] output2=peaksAndVa.sortInPeaksValleysEfficient(input);

		System.out.println("Length"+output2.length);
		
		for (int i=0;i<output2.length;i++){
			System.out.println(output2[i]);
		}
	}

}
