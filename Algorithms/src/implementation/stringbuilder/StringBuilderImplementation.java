package implementation.stringbuilder;

public  class StringBuilderImplementation {
	
	static Character[]  appendingChar;
	static Character[] tempArr;
	static Integer size;
	Integer INITIAL_LENGTH=0;
	static Integer count;
	
	StringBuilderImplementation(){
		//appendingChar=new Character[INITIAL_LENGTH];
		size=0;
		count=0;
	}
	
	public static String appendString(String input){
		
		if (size==0){
			size=input.length();
			expandArray(appendingChar);
		}
		
		for (int i=count;i<(count+input.length());i++){
			System.out.println(appendingChar.length);
			appendingChar[i]=input.charAt(i-count);
			size--;
		}
		count=count+input.length();
		
		
		return String.valueOf(appendingChar);
	}
	
	public static Character[] expandArray(Character[] appendingChar){
		
		if (appendingChar==null){
			appendingChar=new Character[size];
		
		}
		else{
		size=appendingChar.length;
		tempArr=new Character[appendingChar.length*2];
		System.arraycopy(appendingChar, 0, tempArr, 0, appendingChar.length);
		appendingChar=tempArr;
		
		}
		
		return appendingChar;
		
	}
	
	

}
