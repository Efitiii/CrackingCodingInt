package mumpreparation.iteratearray;

public class TestIterateArray {
	
	
	public static void main(String[] arg ){
		
		IterateArray iterateA= new IterateArray();
		//int[] input= new int[]{1,2,3,-1};
		int[] input2= new int[]{5,3,4,-1,1,2};
		int[] input3= new int[]{1,2,4,-1};
		int[] input4= new int[]{3,2,3,1};
		int[] input5= new int[]{};
		
		// if output is -8 then the array's size is 0
		System.out.println(iterateA.iterateArray(input5));
	}

}
