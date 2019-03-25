package sortingandsearching.peaksAndValleys;

public class PeaksAndValleysSolution {
	
	public void sortAccordingPeakAndValley(Integer[] input){
		
		int end= input.length-1;
		Integer[] sortedA=quickSort(input, 0, end);
	
	}
	
	
	public Integer[] quickSort(Integer[] input, int start, int end){
		Integer[] output= new Integer[input.length];
		
		while (end>start){
			
			int middle= (start+end)/2;
			
			quickSort(input, start, middle);
			quickSort(input,middle+1, end);
			
			for (int i=start;i<=end;i++){
				
			}
		}
		
		return output;
		
	}
	
	

}
