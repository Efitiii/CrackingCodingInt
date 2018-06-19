package arraysAndStrings.palindrome;

public class PalindromeBitManipulation {
	
	public boolean checkIfPalindrome(String input){
		boolean isPalindrome=false;
		int iterator=0;
		int checker=0;
		int countSpace=0;
		
		while (iterator<input.length()){
			
			if (input.charAt(iterator)==' '){
				countSpace++;
			}
			else{
			int valA = Character.getNumericValue('a');
			int value = Character.getNumericValue(input.charAt(iterator));
			int diff= 1 << value-valA;
			
			checker ^= diff;
			
			}
			
			iterator++;
			// 0000000001   0000000100 0000010001 
			// 0 1 1  1 1 0
			
			// 0000100
			// 0000001
			// 0000010
		}
		
		if ((input.length()-countSpace)%2==0 && checker==0){
		  isPalindrome=true;
		}
		else if ((input.length()-countSpace)%2 != 0){
			int temp= checker - 1;
			 if ((temp & checker) ==0){
				 isPalindrome=true;
			 }
		}
		
		return isPalindrome;
	}

}
