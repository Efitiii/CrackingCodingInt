package arraysAndStrings.rotateMatrix;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class RotateMatrixTest extends TestCase {
	
	    // [1 0 1]
		// [1 1 1]
		// [0 1 0]
		
		// [0 1 1]
		// [1 1 0]
		// [0 1 1]
	
	@Test
	public void testRotateMatrix(){
		
		RotateMatrix rotate = new RotateMatrix();
		RotateMatrix_Efficient rotateEfficient = new RotateMatrix_Efficient();
		
		int[][] input= new int[][]{{1, 0, 1}, {1, 1, 1}, {0, 1, 0}};
		
		//int[][] output=rotate.rotateMatrix(input);
		int[][] output=rotateEfficient.rotateMatrixEfficient(input);
		
		for (int r=0; r<output.length;r++){
			for (int c=0; c<output[0].length;c++){
				System.out.print(output[r][c]+",");
			}
			
			System.out.println();
		}
		
	}

}
