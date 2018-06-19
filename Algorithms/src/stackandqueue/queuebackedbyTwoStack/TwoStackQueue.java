package stackandqueue.queuebackedbyTwoStack;

import java.util.Stack;

public class TwoStackQueue {
	
	Stack<String> stack1;
	Stack<String> stack2;
	
	public TwoStackQueue(){
		stack1= new Stack<>();
		stack2 = new Stack<>();
	}
	
	public void enqueue (String input){
		
		if (stack2.isEmpty()){
			stack2.push(input);
		}
		
		else {
			for (int i=0; i<stack2.size();i++){
				stack1.push(stack2.pop());
			}
			stack1.push(input);
			
			for (int u=0; u<stack1.size();u++){
				stack2.push(stack1.pop());
			}
		}
		
	}
	
	
	public String dequeue (){
		if (stack2.isEmpty()){
			return null;
		}
		return stack2.pop();
	}
	
	public String peek(){
		if (stack2.isEmpty()){
			return null;
		}
		
		return stack2.peek();
	}
//input a	
//1 a b c =>d
//2 => d c b a 

}
