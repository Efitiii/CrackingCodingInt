package facebookInterview.goatWord;

import java.util.LinkedList;

public class GoatWord {
	
	
	public String string_to_goat_latin(String input){
		//"I speak Goat Latin"
		
		// String[] words = input.split("\\s+");
		
		// for (int i=0; i<words.length; i++){
		// 
		//}
		
		StringBuilder output= new StringBuilder();
		StringBuilder aAppender= new StringBuilder();
		aAppender.append("a");
		String ma= "ma";
		
		LinkedList<Integer> l= new LinkedList<Integer>();
		
		String[] words = input.split("\\s+");
		
		for (int i=0; i<words.length; i++){
			String lCaseword=words[i].toLowerCase();
				if (lCaseword.charAt(0)!='a' || lCaseword.charAt(0)!='u' || lCaseword.charAt(0)!='i' || lCaseword.charAt(0)!='o' || lCaseword.charAt(0)!='e'){
					output.append(words[i].substring(1, words[i].length()));
					output.append(words[i].charAt(0));
					output.append(ma);
					output.append(aAppender.toString());
					output.append(" ");
					aAppender.append("a");
					
				}
				else {
					output.append(words[i]);
					output.append(ma);
					output.append(aAppender.toString());
					output.append(" ");
					aAppender.append("a");
				}
		}
		
		
		return output.toString();
	}

}
