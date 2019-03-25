package arraysAndStrings.stringcompression;

public class StringCompressionTrial2 {
	
	public String compressString(String input){
		
		StringBuilder output= new StringBuilder();
		int i=0;
		
		while (i<input.length()){
		    char current_char= input.charAt(i);
		    int count=0;
		    output.append(current_char);
		    
		    while (i<input.length() && current_char==input.charAt(i) ){
		    count++;
		    i++;
		    }
		    
		    output.append(count);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
		
		if (output.length()>input.length()){
			return input;
		}
		
		
		return output.toString();
	}

}
