package arraysAndStrings.zeroMatrix;

import java.util.ArrayList;

public class ZeroMatrix {
	
	public int[][] changeToZero(int[][] input){
		
		// [0 0 0]
	   //  [1 0 0]
	   //  [0 0 1]
	ArrayList<Integer> coordinates[] = new ArrayList[input.length];	
		
	boolean[] row = new boolean[input.length];
	boolean[] column = new boolean[input[0].length];
	int r=0;
	int c=0;
		

	while (r<input.length){
			
			while (c<input[0].length){
				
				if (input[r][c]==0){
					row[r]=true;
					column[c]=true;
				}
				
				c++;
				
			}
			
			r++;
		}
	
	for (int i=0; i<row.length;i++){
		 if (row[i]==true){
		   for (int u=0; u< input.length;u++){
            input[i][u]=0;
		   }
		 }
	}
	
	
	for (int i=0; i<column.length;i++){
		 if (column[i]==true){
		   for (int u=0; u< input.length;u++){
           input[u][i]=0;
		   }
		 }
	}

return input;
}
	
}
