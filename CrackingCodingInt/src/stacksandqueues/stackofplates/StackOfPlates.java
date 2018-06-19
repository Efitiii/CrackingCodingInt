package stacksandqueues.stackofplates;

import java.util.ArrayList;
import java.util.List;

public class StackOfPlates {
	
	// 1 2 3 4 5 
	// 6 7 8 9 10
	List<MyLinkedList> stackList;
	Integer size;
	Integer stackActive;
	Integer stackSize;
	
	StackOfPlates(Integer stackSize){
		this.stackList= new ArrayList<MyLinkedList>();
		this.stackSize=stackSize;
		stackList.add(new MyLinkedList());
		this.size=0;
		this.stackActive=-1;
	}
	
	
	
	
	public void pushToStack(Integer val){
		if (size==0){
			stackList.add(new MyLinkedList());
			this.stackActive++;
			size=stackSize;
		}
		
		MyLinkedList activeStack=stackList.get(stackActive);
		size--;
		
		activeStack.add(val);	
	}
	
	public Integer peekStack(){
		
		MyLinkedList activeLink= stackList.get(stackActive);
		
		if(activeLink.getTopValue()==null){
			System.out.println("Stack is empty");
		}
		
		return activeLink.getTopValue();
		
	}
	
	
	public Integer popStack(){
		
		MyLinkedList activeLink=stackList.get(stackActive);
		
		if(activeLink.getTopValue()==null){
			System.out.println("Stack is empty");
		}
		
		return activeLink.removeTopValue();
		
		
	}
	
	public void printStack(){
		Integer currentStack=0;
		while (currentStack<=stackActive){
			
				MyLinkedList activeLink=stackList.get(currentStack);
				System.out.println(activeLink.printLinkedList(currentStack));
				currentStack++;
			    
		}
		
	}
	
	
	
	

}
