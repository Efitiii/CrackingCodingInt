package arraysAndStrings.rotateMatrix;

public class RotateMatrix {
	
	// [1 0 1]
	// [1 1 1]
	// [0 1 0]
	
	// [0 1 1]
	// [1 1 0]
	// [0 1 1]
	
	//Space Complexity is O(N) and time complexity is O(n2)
	
	public int[][] rotateMatrix(int[][] input){
	int[][] output= new int[input[0].length][input.length];
	int output_row = input[0].length;
	int output_column= input.length-1;
	
	for (int r=0; r<input.length;r++){
		for (int c=0; c<input[0].length;c++){
			output[c][output_column-r]=input[r][c];
		}
	}
	return output;
	}
		

}
