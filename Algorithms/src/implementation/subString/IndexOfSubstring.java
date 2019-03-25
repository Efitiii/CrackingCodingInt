package implementation.subString;

public class IndexOfSubstring {
	// hello , ll
	// 0100100   0000100 = 
	
	public int indexOfSubstring(String input, String subString){
		int u=0;
		int i=0;
		boolean isSubString=false;
		
		while (i<input.length() && input.length()-i>=subString.length() && isSubString==false){
		     if (input.charAt(i)==subString.charAt(0)){
		    	String temp= input.substring(i, i+subString.length());
		    	
		    	if (temp.equals(subString)){
		    		isSubString=true;
		    	}
		     }
		     i++;
		}
		
		if (isSubString==true){
			return i-1;
		}
		
		return 0;
		
	}

}
