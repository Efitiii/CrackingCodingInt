package arraysAndStrings.rotateMatrix;

public class RotateMatrix_Efficient {
	
	// [1 0 1]
	// [1 1 1]
	// [0 1 0]
	
	// [0 1 1]
	// [1 1 0]
	// [0 1 1]
	
	public int[][] rotateMatrixEfficient(int[][] input){
		
//		int temp= input[0][0];
//		input[0][0]=input[0][input.length-1];
//		input[input.length-1][0]=input[input.length-1][input[0].length-1];
//		input[input.length-1][input[0].length-1]=input[0][input[0].length-1];
//		input[0][input[0].length-1]=temp;
		
		double u=Math.log(input.length);
		int x=0;
		while (u>x){
		for (int i=0+x;i<input.length-x;i++){
		if (x<input.length){
		int temp2= input[x][i];
		input[x][i]=input[input[0].length-1-i][x];
		input[input[0].length-1-i][x]=input[input[0].length-1-x][input.length-1-i];
		input[input[0].length-1-x][input.length-1-i]=input[x][input[0].length-1-x];
		input[i][input[0].length-1-x]=temp2;
		}
		
		}
		
		u--;
		x++;
		
		}
		return input;
		
	}


}
