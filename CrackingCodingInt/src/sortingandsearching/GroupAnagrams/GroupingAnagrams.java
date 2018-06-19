package sortingandsearching.GroupAnagrams;

import java.util.HashMap;
import java.util.Map;

public class GroupingAnagrams {
	
	
	Map<String,Integer> stringSize;
	
	GroupingAnagrams(){
		stringSize=new HashMap<String,Integer>();
	}
	
	public String[] groupingAnagrams(String[] input){
		Integer sum=0;
		// eat, boss, ball, tea, beats, ate,  
		// 5, 4, 3, 7, 9, 8, 1
		// 5, 3, 4, 7, 9, 8, 1
		//3, 14, 15, 17, 1, 8, 9
		//1  3           8, 9, 14
		
		for (int i=0;i<input.length;i++){
			sum=0;
			for (int u=0;u<input[i].length();u++){
				sum+=Character.getNumericValue('a')-Character.getNumericValue(input[i].charAt(u))+1;
			}
			
			if (!stringSize.containsKey(input[i])){
			stringSize.put(input[i], sum);
			}
			
		}
		
		return sortInput(input, 0, input.length-1);
		
		
	}
	
	public String[] sortInput(String[] input, Integer start,Integer end){
		Integer mid;
		Integer iterator;
		boolean inserted=false;
		
		if ((end-start)==0){
			return input;
		}
		
		if ((end-start)==1){
			if(stringSize.get(input[0])>stringSize.get(input[1])){
				String temp= input[0];
				input[0]=input[1];
				input[1]=temp;
//				input[0]=input[0]*input[1];
//				input[1]=input[0]/input[1];
//				input[0]=input[0]/input[1];
			}
			
			return input;
		}
		
		mid=(start+end)/2;
		
		String[] output1= sortInput(input,start,mid);
		String[] output2= sortInput(output1,mid+1, end);
		
		
			for(int i=0; i<=mid; i++){
				if (stringSize.get(output2[i])>stringSize.get(output2[mid+1])){
					
					String temp= output2[i];
					output2[i]=output2[mid+1];
					output2[mid+1]=temp;
//					output2[i]=output2[i]*output2[mid+1];
//					output2[mid+1]=output2[i]/output2[mid+1];
//					output2[i]=output2[i]/output2[mid+1];
//					
					iterator=mid+1;
					inserted=false;
					while (iterator<end-1 && inserted==false){
						if (stringSize.get(output2[iterator])>stringSize.get(output2[iterator+1])){
							
							
						String temp2= output2[iterator];
						output2[iterator]=output2[iterator+1];
						output2[iterator+1]=temp;
//							output2[iterator]=output2[iterator]*output2[iterator+1];
//							output2[iterator+1]=output2[iterator]/output2[iterator+1];
//							output2[iterator]=output2[iterator]/output2[iterator+1];			
						}
						else{
							inserted=true;
						}
						
						iterator++;
					}
					
				}
			}
			
		
		
		
		return output2;
		
		
		
	}

}
