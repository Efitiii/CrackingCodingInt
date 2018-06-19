package arraysAndStrings.isSubString;

public class IsSubString {
	
	boolean permutationYes;
	Integer countHolder;
	
	public boolean findIfPermutation(String input, String original){
		permutationYes=false;
		countHolder=0;
		//ak acdaak i=0 .. i<original.length()-3
		char first= input.charAt(0);
		while (permutationYes==false && countHolder<original.length() - input.length()+1){
			if (first == original.charAt(countHolder)){
				if (input.equals(original.substring(countHolder,countHolder+ input.length()))){
					permutationYes=true;
					
				}
				
			}
			
			countHolder++;
		}
		
		return permutationYes;
		
		
	}

}
