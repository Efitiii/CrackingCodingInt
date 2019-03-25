package dawitAlgorithm.targetSumOffour;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestTargetSum extends TestCase {

	
	@Test
	public void testTargetSum(){
		
		Integer[] input= new Integer[]{3,2,1,4,7,0,-1};
		Integer target=6;
		
		TargetSum targetSum= new TargetSum();
		List<Integer[]> output=targetSum.findTargetSum(target, input);
		
//		output.forEach(a->{
//			for (int i=0;i<a.length;i++){
//				System.out.print(a[i]+",");
//			}
//			System.out.println("");
//		});

		Queue<Double> que= new LinkedList<>();
		Double a=0.00;
		Integer b= a.intValue();

		
		System.out.println(output.size());
		
		for (int u=0;u<output.size();u++){
		for (int i=0;i<3;i++){
			System.out.print(output.get(u)[i]+",");
		}
		System.out.println("");
		}
	}
}
