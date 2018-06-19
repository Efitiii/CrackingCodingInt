package arraysAndStrings.stringcompression;

public class StringCompression {
	
	//aabcccccaa a2b1c5a2
	// a 2, b 1, c 5, a2  n + n = 2n == 
	public String compressString(String input){
		
		StringBuilder str= new StringBuilder();
		int count=1;
		boolean stillOnFirstChar=true;
		boolean stillCounting;
		int indexOfStr=0;
		
		if (input.length()==0){
            return input;
		}
		//aaaabbbcddaaa     a5b3c1d2a3
		str.append(input.charAt(0));
		
		for (int i=1; i<input.length(); i++){
			//str.append(input.charAt(i-1));	
			stillCounting=true;
			
		  //while (stillCounting==true){
			if (str.charAt(indexOfStr)==input.charAt(i)){
				count++;

			}
			else if (stillOnFirstChar==true){
				str.append(count);
				str.append(input.charAt(i));
				stillOnFirstChar=false;
				stillCounting=false;
				indexOfStr+=2;
				count=1;
			}
			else {
				str.append(count);
				str.append(input.charAt(i));
				count=1;
				stillCounting=false;
				indexOfStr+=2;

			}
		 // }
		
			
			
		}
		
		str.append(count);
		
		if (str.length()>input.length()){
			return input;
		}
		
		
		
		return str.toString();
	}

}
