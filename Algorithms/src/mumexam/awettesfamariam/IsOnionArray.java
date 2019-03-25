package mumexam.awettesfamariam;

public class IsOnionArray {
	
	public void IsOnionArray(){
		
	}
	
	public int isOnionArray(int[] input){
		
		if (input.length==0 || input.length==1){
			return 1;
		}
		
		int k=input.length-1;
		int j=0;
		int mid=input.length/2;
		boolean isOnion=true;
		
		 while(j<mid && isOnion==true){
			if (input[j]+input[k]>10){
				isOnion=false;
			}
			j++;
			k--;
		}
		 
		
		 if (isOnion==false){
			 return 0;
		 }
		
		
		
		return 1;
	}

}
