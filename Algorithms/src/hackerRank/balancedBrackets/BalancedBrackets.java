package hackerRank.balancedBrackets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {


	    // Complete the isBalanced function below.
	    static String isBalanced(String s) {

	        if (s.length()%2!=0 || s.length()==0){
	            return "NO";
	        }
	       Stack<Character> stack= new Stack<Character>();
	       int mid= s.length()/2;
	       int i=1;
	       boolean isBalanced=true;
	       stack.push(s.charAt(0));
	       
	    //    while (i<mid){
	    //        stack.push(s.charAt(i));
	    //        i++;
	    //    }

	       while (i<s.length()){
	        if (stack.isEmpty()){
	            stack.push(s.charAt(i));

	        }else if (s.charAt(i)!=getBracketToBalance(stack.peek())
	        || !checkIfOpening(stack.peek())){
	                stack.push(s.charAt(i));
	           }
	           else{
	               stack.pop();
	           }
	           i++;
	       }

	       if (!stack.isEmpty()){
	           return "NO";
	       }

	       return "YES";

	    }

	    static Character getBracketToBalance(Character c){
	     switch (c){
	        case ']': return '[';
	        case '[': return ']';
	        case '{': return '}';
	        case '}': return '{';
	        case '(': return ')';
	        case ')': return '(';
	     }
	     return null;

	    }

	    static boolean checkIfOpening(Character c){
	        switch (c) {
	        case ']':
	            return false;
	        case '[':
	            return true;
	        case '{':
	            return true;
	        case '}':
	            return false;
	        case '(':
	            return true;
	        case ')':
	            return false;
	        }
	        return false;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            String s = scanner.nextLine();

	            String result = isBalanced(s);

	            bufferedWriter.write(result);
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
