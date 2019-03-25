package numberOfFactors.dani.mum;

import java.util.HashMap;
import java.util.Map;

public class ThreeTimesOccurance {

	public ThreeTimesOccurance(){}
	
	public int answerThree(int[] input){
		
		Map<Integer,Integer> numberOfOccurance= new HashMap<Integer, Integer>();
		boolean exceedingThanThree=false;
		int i=0;
		int count=0;
		
		if (input.length<3){
			return 0;
		}
		
		while (i<input.length && exceedingThanThree==false){
			if (!numberOfOccurance.containsKey(input[i])){
				numberOfOccurance.put(input[i], 1);
			}
			else {
				count=numberOfOccurance.get(input[i]);
				if (count<=2){
					numberOfOccurance.put(input[i], count++);
				}
				else{
					exceedingThanThree=true;
				}
			}
			i++;
		}
		
		if (exceedingThanThree==false){
			return 1;
			}
		
		return 0;
	}

}
