package stackandqueue.symmetryOfBrackets;

import java.util.Stack;

public class SymmetryOfBrackets {
	
	public boolean symmetryOfBrackets(String brackets){
    boolean isSymmetric=true;
    Stack<Character> bracketStoreSquare= new Stack<Character>();
    Stack<Character> bracketStoreCurly= new Stack<Character>();
    Stack<Character> bracketStoreAngle= new Stack<Character>();
    Stack<Character> bracketStoreCurve= new Stack<Character>();
    int i=0;
    
    
    // []{}[[{{]}}]  
    //[ { [ [ { {   
    //] } ] } }
    // {}[]()
    
    
    while (i<brackets.length() && isSymmetric==true){
    	Character input= brackets.charAt(i);
    	switch(input) {
    	case '[' : case ']': 
    			if (input=='['){
    				bracketStoreSquare.push(input);
    				break;
    			}
    			else if (bracketStoreSquare.isEmpty()){
    				isSymmetric=false;
    				break;
    			}
    			else {
    				bracketStoreSquare.pop();
    				break;
    			}
    	case '{': case '}' :
    		if (input=='{'){
				bracketStoreCurly.push(input);
				break;
			}
			else if (bracketStoreCurly.isEmpty()){
				isSymmetric=false;
				break;
			}
			else {
				bracketStoreCurly.pop();
				break;
			}
    	case '<': case '>' :
    		if (input=='<'){
				bracketStoreAngle.push(input);
				break;
			}
			else if (bracketStoreAngle.isEmpty()){
				isSymmetric=false;
				break;
			}
			else {
				bracketStoreAngle.pop();
				break;
			}
    	case '(': case ')' :
    		if (input=='('){
				bracketStoreCurve.push(input);
				break;
			}
			else if (bracketStoreCurve.isEmpty()){
				isSymmetric=false;
				break;
			}
			else {
				bracketStoreCurve.pop();
				break;
			}
    	
    	}
    	i++;
    }
    
    if (!bracketStoreCurve.isEmpty() || !bracketStoreCurly.isEmpty() || !bracketStoreAngle.isEmpty() || !bracketStoreSquare.isEmpty()){
    	isSymmetric=false;
    }
    
    return isSymmetric;
	}
	
	
	public boolean symmetryOfBrackets2(String brackets){
		boolean isSymmetric=false;
		Integer iterator=0;
		Integer temp=0;
		Integer reference=Character.getNumericValue('(');
		
		while (iterator<brackets.length()){
			Character input=brackets.charAt(iterator);
			Integer input2=Character.getNumericValue(input);
			Integer location=input2-reference+1;
			
			switch (input){
			case '(' : case ')':
				
				if (input=='('){
					reference=reference+location;
				}
				
				
			}
		}
		
		
		return isSymmetric;
		
	}
	

}
