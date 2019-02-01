package recursionanddynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class StairCaseHop {
	//n steps
	//1 step, 2 step, 3 step
	// 111 12 3
	//5 4 3 2 1
	//1//1
	//2//11  2
	//3//[3-1]111 12 3
	//4//1[4-1]111 112 13 2[4-2]11 22 4
	Map<Integer,Integer> mapCount= new HashMap<Integer,Integer>();
	Integer sml=0;
	Integer smlr=0;
	Integer smlst=0;
	
	
	//The method which works right
	public Integer computeCombinationOfSteps(int totalSteps, int numOfPossibilities){
		
		//Combination of 1 and 2
		// 1 1
		// 2 11 2
		// 3 111 21 12
		// 4 1111 211 121 22 112
		// 5 11111 2111 1211 221 1121 1112 212 122
		// 6 11111 2111 1211 221 1121 1112 212 122
		
		//Combination of 1, 2 and 3
		// 1 1
		// 2 11 2
		// 3 111 21 12 3
		// 4 1111 211 121 31 13 22 112
		// 5 11111 2111 1211 311 131 221 1121 1112 212 122 32 113 23
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2,2);
		
		int temp=0;
		
		if (totalSteps<1){
			System.out.println("Too less steps provided");
		}
		
		for (int i=3;i<=totalSteps;i++){
			
			for (int j=1;j<=numOfPossibilities && j<i;j++){
				temp+= map.get(i-j);		
			}
			
			if (numOfPossibilities==i){
				temp+=1;
			}
			
			map.put(i,temp);
			temp=0;
			//1 1
			//2 2
			//3
		}
		
		return map.get(totalSteps);
		
	}
	
	
	
	public Integer countNumberOfSteps(Integer s1, Integer s2, Integer s3, Integer n){
		
		if (s1<s2){
			if (s1<s3){
				this.smlst=s1;
				if (s2<s3){
					this.smlr=s2;
					this.sml=s3;
				}
				else{
					this.smlr=s3;
					this.sml=s2;
				}
			}
			else{
				this.smlst=s3;
				if (s2<s1){
					this.smlr=s2;
					this.sml=s1;
				}
				else{
					this.smlr=s1;
					this.sml=s2;
				}
			}
		}
		else{
			if(s2<s3){
				this.smlst=s2;
				if (s3<s1){
					this.smlr=s3;
					this.sml=s1;
				}
				else{
					this.smlr=s1;
					this.sml=s3;
				}
			}
			this.smlst=s3;
			this.smlr=s2;
			this.sml=s1;	
		}
		
		
		for (int i=smlst;i<=n;i++){
			findNumberOfPossibilities (i);
		}
		
		//Stack rr= new Stack();
		return mapCount.get(n);
		
	}
	
	
	//4// 1 + (3-1) + 1=4
	//5// 1 + 4 + (3-2)+1= 7
	//6// 1 + 7 + (4-2)+1 = 11
	
	public void findNumberOfPossibilities(Integer input){
		Integer possibilities=0;
		//int[] a= new int[5];
		

		
		
		// 1 1              1                                                                                   (1x0)+1 = 1
		// 2 2[11 2]        1 + 1                                                                               (1X1)+1 = 2
		// 3 3[111 21 3]    1 + 1 + 1                                                                           (1X2)+1 = 3
		// 4 4[1111 211 31 22 4] (1+3) = 1+ (2-1) = 1 + (2-1)+(3-2)+1=4    1 + (3-1) + 1 = 4                    (1X3)+(1X1)+1 = 5
		// 5 7  5-1[4] 5-2[3]  [11111 2111 311 41 221 32 5]    1 + (2-1)      1 + (4-1) + (3-2) + 1 = 7         (1X5)+(3-2)+1 = 7
		// 6 6-1 6-2 [12]      [111111 21111 3111 411 2211 321 51 222 42 33 6]  1 + (7-1) + (4-2) + 1 = 8       (1X7)+(5-3)+(1)+(1) = 11
		// 7  [1111111 211111 31111 4111 21211 3211 511 2221 421 331 61 52 322 43 7]                    (1X11)+(7-5)+(5-3)+1= 15
		// 8
		
		if (input<this.smlst){
			return;
		}
		
		else {
			
			if (!mapCount.containsKey(input-this.smlst)){
				mapCount.put(input, 1);
			}
			else {
				possibilities=mapCount.get(input-this.smlst)+1;
				
				for (int i=this.smlst+1;i<=input/2;i++){
					possibilities+=mapCount.get(input-i);
					
					for (int u=1;u<i;u++){
						
					possibilities-=mapCount.get(input-i-u);
					
					// 5 & i=2 =  P5 - P4
					// 4 & i=3 =  P4 - P3 - P2
					
					}
					
					// 7 + 
					
				}
				
				mapCount.put(input, possibilities);
				
			}
		}
		
	}
}



	
	
