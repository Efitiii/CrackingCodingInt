package sortingandsearching.sortedMerge;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestSortedMerge extends TestCase{
	
	// 2 4 7 9 10   1 5 6 8
	@Test
	public void testSortedMerge(){
		SortedMerge sorted= new SortedMerge();
		int[] input1=new int[10];
		input1[0]=2;
		input1[1]=4;
		input1[2]=7;
		input1[3]=9;
		input1[4]=10;
		
		int[] input2= new int[]{1,5,6,8};
		
		
		int[] output=sorted.sortandMerge(input1, input2);
		
		for (int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}
		
		
	}

}
