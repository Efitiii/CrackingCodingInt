package sortingandsearching.GroupAnagrams;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestGroupAnagram extends TestCase{
	
	@Test
	public void testGroupingofAnagram(){
		GroupingAnagrams group= new GroupingAnagrams();
		//Integer[] input= new Integer[]{5,2,6,1,3,8};
		//2, 5, 6  1, 3, 8
		//1  2     5
		
		String[] input= new String[]{"abc", "got", "bca", "boz", "cba", "zob"};
		String[] output=group.groupingAnagrams(input);
		
		for (int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}
	}

}
