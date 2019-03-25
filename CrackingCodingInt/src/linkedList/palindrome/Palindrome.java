package linkedList.palindrome;

import java.util.Stack;

public class Palindrome {
	
	public Palindrome(){
		this.isPalindrome=true;
	}
	boolean isPalindrome;
	
	public boolean checkPalindrome(MyLinkedList input){
		
		if (input.size<=2){
			return true;
		}
		
		Integer size = input.getSize();
		
		Stack<Character> stackCharacter= new Stack<>();
		
		Integer mid= size/2;
		
		Node currentNode=input.head.next;
		
		boolean palindrome=true;
		
		int i=0;
		
		while (i<mid){
			stackCharacter.add(currentNode.value);
			currentNode=currentNode.next;
			i++;
		}
		
		if (size%2!=0){
			currentNode=currentNode.next;
		}
		
		while (palindrome == true && currentNode.next!=null){
			if (stackCharacter.pop()!=currentNode.value){
				palindrome=false;
			}
			
			currentNode=currentNode.next;
		}
		
		return palindrome;
		
	}
	
	
	public boolean checkPalindromeByFastSlowRunnerTechnique(MyLinkedList input){
		
		if (input.size<=2){
			return true;
		}
		
		boolean odd=false;
		boolean isPalendrome=true;
		
		// a -> b ->c-> b ->a
		
		Stack<Character> stack= new Stack<>();
		
		Node fastRunner=input.head.next.next;
		Node slowRunner= input.head.next;
		stack.add(slowRunner.value);
		
		while(fastRunner.next!=null){
			
			if (fastRunner.next.next!=null){
				fastRunner=fastRunner.next.next;
				slowRunner= slowRunner.next;
				stack.add(slowRunner.value);
			}
			else{
				fastRunner=fastRunner.next;
				odd=true;
				//stack.add(slowRunner.value);
			}
			
			
		}
		
		if (odd==true){
			slowRunner=slowRunner.next;
		}
		
		while (slowRunner.next!=null && isPalendrome==true){
			if (slowRunner.next.value!=stack.pop()){
				isPalendrome=false;
			}
			slowRunner=slowRunner.next;
		}
		
		return isPalendrome;
	}
	
	
	
	public boolean checkPalindromeRecursion(MyLinkedList myList){
		
		if (myList.getSize()<=2){
			return true;
		}
		
		boolean odd=true;
		
		if (myList.getSize()%2==0){
			odd=false;
		}
		
		checkPalindromeUsingRecursion(myList.head.next, myList.getSize()/2, odd);
		
		return isPalindrome();
		
	}
	
	//head-> a->b->c->d->c->b->a
	
	public Node checkPalindromeUsingRecursion(Node head, Integer sizeHalf, boolean odd){
		
		if (sizeHalf==0 && odd==true){
			return head.next;
		}
		else if (sizeHalf==0 && odd==false){
			return head;
		}
		
		Node returnedNode=checkPalindromeUsingRecursion(head.next,sizeHalf-1,odd);
		
		if (head.value!=returnedNode.value){
			
			setPalindrome(false);
		}
		
		
		return returnedNode.next;
		
		
	}


	public boolean isPalindrome() {
		return isPalindrome;
	}


	public void setPalindrome(boolean isPalindrome) {
		this.isPalindrome = isPalindrome;
	}
	
	
	

}


// abcdcba

// a->b->c->d->c->b->a

// a->b->c->c->b->a


 