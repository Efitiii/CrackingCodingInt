package implementation;

public class BinarySearchTree {
	
	public int binarySearch(int num, int[] arr){
		
		int currentEnd=arr.length-1;
		int currentMid=arr.length/2;
		int currentStart=0;
		boolean found=false;
		
		while (found==false){
			
			if(arr[currentMid]==num){
				return currentMid+1;
			}
			else
			if(arr[currentStart]==num){
				return currentStart+1;
			}
			else
				if(arr[currentEnd]==num){
					return currentEnd+1;
				}
			
			if (arr[currentMid]<num){
				currentStart=currentMid;
				currentMid= (currentStart+currentEnd)/2;
			}
			else if (arr[currentMid]>num){
				
				currentEnd=currentMid;
				currentMid= (currentStart+currentEnd)/2;
			}
		}
		return -1;
	}

}
