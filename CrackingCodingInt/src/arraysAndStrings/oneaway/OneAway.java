package arraysAndStrings.oneaway;

//This solution won't work

public class OneAway {
	
	// pale pal 
	// pale bale
	// pale pales

	public boolean checkOneAway(String input, String check){
		boolean isOneAway=false;
		int bit1= createBit(input);
		int bit2= createBit(check);
		
		int result=(bit1 ^ bit2);
		// 0000100 0000001 00000011  000000
		
		if (((result-1) & result) == 0 && bit1!=bit2){
			isOneAway=true;
		}
		else if (((result-1) & result) != 0 && bit1==bit2){
			isOneAway=true;
		}
		// 0001001001 
		// 0000000001
		// 0000100100
		
		return isOneAway;
	}
	
	public int createBit(String in){
		int checker=0;
		
		int valA= Character.getNumericValue('a');
		
		for (int i=0; i< in.length();i++){
			int diff= in.charAt(i)-valA;
			checker |= ( 1 << diff);
		}
		
		return valA;
	}
}
