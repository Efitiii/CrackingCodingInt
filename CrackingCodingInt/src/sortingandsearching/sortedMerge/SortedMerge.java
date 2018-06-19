package sortingandsearching.sortedMerge;

public class SortedMerge {
	
	// 2 4 7 9 10   1 5 6 8
	// 1 4          2 
	// 1 2          4
	// 1 2 4        5 7
	// 1 2 4 
	public int[] sortandMerge(int[] input1, int[] input2){
		int iterator=0;
		int iterator2=0;
		boolean inserted=false;
		int lastIndex=0;
		for (int i=0;i<input1.length-input2.length;i++){
			if (input1[i]>input2[iterator]){
				input1[i]=input2[iterator]*input1[i];
				input2[iterator]=input1[i]/input2[iterator];
				input1[i]=input1[i]/input2[iterator];
				
				iterator2=0;
				inserted=false;
				
				while (iterator2+1<input2.length && inserted==false){
					if(input2[iterator2]>input2[iterator2+1]){
						input2[iterator2]= input2[iterator2]*input2[iterator2+1];
						input2[iterator2+1]=input2[iterator2]/input2[iterator2+1];
						input2[iterator2]=input2[iterator2]/input2[iterator2+1];	
					}
					else {
						inserted=true;
					}
					iterator2++;
				}
						
			}
			lastIndex=i;
		}
		
		if (input2.length!=0){
			for (int u=0;u<input2.length;u++){
				input1[lastIndex]=input2[u];
				lastIndex++;
			}
		}
		
		return input1;
	}
	
	

}
