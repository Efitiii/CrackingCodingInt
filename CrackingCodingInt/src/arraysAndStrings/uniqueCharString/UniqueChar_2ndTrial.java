package arraysAndStrings.uniqueCharString;

public class UniqueChar_2ndTrial {
	
	public boolean uniqueChar(String input){
		Integer holder = 0;
		Integer checker=0;
		boolean isUnique=true;
		int i=0;
		
		while (isUnique==true && i<input.length()){
		   Character toBeTried = input.charAt(i);
		   Integer charInt= toBeTried-'a';
		   
		   checker= (1 << charInt) & holder;
		   
		   if (checker!=0){
			   isUnique=false;
		   }
		   else {
			   holder = holder | (1 << charInt);
			   i++;
		   }
		   
		   
		}
		
		return isUnique;
	}

}
