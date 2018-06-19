package arraysAndStrings.palindrome;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
	
	// tact coa  = tac  o  cat
	// for every char we have another char
	//all char values must be even if the length is even
	//all char values must be even + one char if the length is odd
	// t, count=1 n+n = 2n
	//
	
	public boolean findIfPermutationOfPalindrome (String input){
		boolean isPermutation=false;
		int countSingleChar=0;
		int count=0;
		int i=0;
		int countSpace=0;
		boolean isSpace=false;
		Map<Character,Integer> permuValues= new HashMap<Character, Integer>();
		
		while (i<input.length()){
			isSpace=false;
			if (input.charAt(i)==' '){
				countSpace++;
				isSpace=true;
			}
			if (!permuValues.containsKey(input.charAt(i)) && isSpace==false){
				permuValues.put(input.charAt(i), 1);
				countSingleChar++;
			}
			
			else if (isSpace==false){
				{
			}
				count=permuValues.get(input.charAt(i));
				 if (count%2!=0){
					 countSingleChar--;
					 count++;
					 permuValues.put(input.charAt(i), count);
				 }
				 else {
					 countSingleChar++;
					 count++;
					 permuValues.put(input.charAt(i), count);
				 }
			}
			
			i++;
			
		}
		
		if ((input.length() - countSpace)%2==0 && countSingleChar==0){
			isPermutation=true;
		}
		if ((input.length() - countSpace)%2!=0 && countSingleChar==1){
			isPermutation=true;
		}
		
		return isPermutation;
		
	}

}
