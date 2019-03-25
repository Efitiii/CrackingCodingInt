package mumexam.awettesfamariam;

public class IsRapidlyIncreasing {
	
	public IsRapidlyIncreasing(){
		
	}
	
	public int isRapidlyIncreasing(int[] input){
		
		if (input.length==1){
			return 1;
		}
		
		int temp=0;
		boolean isRapidlyIncreasing=true;
		int iterator=1;
		
		while (iterator<input.length && isRapidlyIncreasing==true){
			
			temp=temp+input[iterator-1];
			
			if (input[iterator]<=temp*2){
				isRapidlyIncreasing=false;
			}
			
			iterator++;
		}
		
		if (isRapidlyIncreasing==false){
			return 0;
			
		}
		
		return 1;
	}

}
