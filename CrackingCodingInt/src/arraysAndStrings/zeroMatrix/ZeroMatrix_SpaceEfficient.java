package arraysAndStrings.zeroMatrix;

public class ZeroMatrix_SpaceEfficient {
	
	public int[][] changeToZero(int[][] input){
		
		
		//check if first row has a zero
		boolean rowHasZero=false;
		boolean columnHasZero=false;
		
		for (int r=0; r<input.length; r++){
			if (input[r][0]==0){
				rowHasZero=true;
				break;
			}
		}
		

		for (int c=0; c<input.length; c++){
			if (input[0][c]==0){
				columnHasZero=true;
				break;
			}
		}
		
		for (int r=0; r<input.length;r++){
			
			for (int c=0; c<input[0].length;c++){
				 if (input[r][c]==0){
					 input[r][0]=0;
					 input[0][c]=0;
				 }
			}
					
		}
	
		
		
		for (int r=0; r<input.length;r++){
		  if (input[r][0]==0){
			  nullifyRow(input,r);
		  }
		}
		
		for (int c=0; c<input.length;c++){
			  if (input[0][c]==0){
				  nullifyColumn(input,c);
			  }
		}
		
		if (rowHasZero==true){
			nullifyRow(input,0);
		}
		
		if (columnHasZero==true){
			nullifyColumn(input,0);
		}
		
		
	return input;
	}
	
	public void nullifyRow(int[][] input, int r){
		
		for (int c=0; c<input[0].length;c++){
			input[r][c]=0;
		}
		
	}
	
	public void nullifyColumn(int[][] input, int c){
		
		for (int r=0; r<input[0].length;r++){
			input[r][c]=0;
		}
		
	}

}
