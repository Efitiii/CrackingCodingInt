package arraysAndStrings.uniqueCharString;

public class UniqueChar {
	Boolean uniqueChar;
	
	UniqueChar(){
		
	}
	public boolean uniqueCharString(String input){
		uniqueChar=true;
		int checker=0;
		
		
		for (int i=0;i<input.length();i++){
			int val=input.charAt(i) -'a';
		
			if ((checker & (1 << val)) > 0){ return false;}
			 checker |= (1 << val);
			
		}
		
		return uniqueChar;
		
	}

}
