package linkedList.loopDetection;

import java.util.LinkedList;

public class LoopDetection {
	
	public static Character loopDetection (LinkedList<Character> input){
		
		Integer holder=0;
		Character output= null;
		 
		
        for (int i=0; i<input.size();i++){
        	
        Integer	holder_char= Character.getNumericValue(input.get(i)) - Character.getNumericValue('a')+1;
        
       // holder = holder & holder_char;
        
        if (holder != (holder & holder_char) ){
        	holder = holder | holder_char;
        }
        else {
        	return input.get(i);
        }
        	
        }
		
		
		return output;
		
	}

}
