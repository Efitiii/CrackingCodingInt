package dawitAlgorithm.targetSumOffour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// find the target sum of say 6 from an array of any four values from an array

public class TargetSum {
	
	List<Integer[]> outputCombinations;
	
	TargetSum(){
		this.outputCombinations= new LinkedList<Integer[]>();
	}
	
	
	public List<Integer[]> findTargetSum(Integer target, Integer[] input){
		
		
		
		if (input.length==0){
			return outputCombinations;
		}
		
		int count=1;
		int start=1;
		Integer inputV=input[0];
		Integer[] combinations= new Integer[3];
		combinations[0]=inputV;
		
		return findPossibleCombinations(inputV,input,start,count, combinations, target);
		
		
		
	
	}
	
	
	public List<Integer[]> findPossibleCombinations(Integer inputV,Integer[] input, Integer start, Integer count, Integer[] outputC, Integer target){
		
		if (start>=input.length){
			return this.outputCombinations;
		}
		
		if (inputV+input[start]==target && count+1==3){
			outputC[2]=input[start];
			this.outputCombinations.add(outputC);
			Integer[] newoutputC=new Integer[3];
			newoutputC[0]=input[start];
			findPossibleCombinations(input[start],input,start+1,1,newoutputC,target);
			
		}
		else {
			
			// sending back the addition of the incoming number and the new number that was found to find a third combination that will give us the target value
			if (count<=1){
			Integer newInputV= inputV+input[start];
			Integer[] newOutputC=new Integer[3];
			newOutputC[0]=outputC[0];
			newOutputC[1]=input[start];
			Integer newCount=count+1;
			if (newInputV!=input[start]){
			findPossibleCombinations(newInputV,input,start+1,newCount,newOutputC,target);
			}
			}
			
			//sending back the original value as the third combination for it is not yet found; so we make a call back with original incoming value to find a third combination
			findPossibleCombinations(inputV,input,start+1,count,outputC,target);
			
			//sending back the newly checked value if in case in later numbers a combination can be found that sum with it to give the target value.
			Integer[] newoutputC=new Integer[3];
			newoutputC[0]=input[start];
			findPossibleCombinations(input[start],input,start+1,1,newoutputC,target);
					
		}
		
		
		
		
		return this.outputCombinations;
		
		
	}

}
