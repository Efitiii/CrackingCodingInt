package mumpreparation.iteratearray;

public class IterateArray {
	
	IterateArray(){
		
	}
	
	// {2,3,2,-1}
	// {3,2,3,1}
	
	
	// {1,2,4,-1}  // 1
	
	public int iterateArray(int[] input){
		int output=-10;
		int count=0;
		int temporary=0;
		
		if (input.length==0){
			
			return -8;
		}
		for (int i=0;i<input.length;i++){
			//input[i]=input[0]=1
			if (input[i]<-1 || input[i]>=input.length){
				output=1;
				return output;
			}
			else if(input[i]==-1){
					output=-1;
					return output;
				}
						
			}
		
		
//		temporary=input[0];
//		while (count<=input.length){
//			temporary= input[temporary];
//			count++;		
//		}	
		
		output=0;
		
			
				
		return output;
	}

}
