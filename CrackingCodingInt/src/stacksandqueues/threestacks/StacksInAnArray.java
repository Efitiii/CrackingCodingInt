package stacksandqueues.threestacks;

import java.util.LinkedList;

public class StacksInAnArray {
	
	// [1,2,3,4]      [2,1,  5,     6,7]
	int[]  data;
	int[] index;
	int size;
	int stackSize1;
	int stackSize2;
	int stackSize3;
	MyLinkedList[] min;
	
	
	StacksInAnArray(int numberOfStacks, int sizeOfEachStack){
		//size=20;
		data= new int[numberOfStacks*sizeOfEachStack]; 
		index= new int[numberOfStacks];
		min= new MyLinkedList[numberOfStacks];
		
		for (int i=0;i<numberOfStacks;i++){
			index[i]=(i*numberOfStacks);
			min[i]= new MyLinkedList();
		}
				
	}
	
	//12 s 3 n 1- 4 ,2- 8, 3- 12
	// s/n=u -- 4,5,i   6,7,8,u  8,k 
	public void addToStack(int stackNum, int input){
		int indexToAdd=0;
		
		
		
		
		if (checkSize(stackNum)){
			System.out.println("Stack no."+stackNum+" is full");
		}
		
		else{
			addMinimum(stackNum,input);
			indexToAdd=index[stackNum-1];
			data[indexToAdd]=input;
			alterIndex(stackNum);
			//indexToAdd++;
			//index[stackNum-1]=indexToAdd;
		}	
		
	}
	
	public void addMinimum(int stackNum, int input){
		boolean inserted=false;
		boolean limitReached=false;
		if(min[stackNum-1].head.next==null){
			min[stackNum-1].head.next= new Node(input,min[stackNum-1].head,null);
			
					}
		else{
			
			Node next= min[stackNum-1].head.next;
			while (inserted==false && limitReached==false){
			
				if (next.value>input){
					Node inputNode= new Node(input,next.prev,next);
					next.prev=inputNode;
					inputNode.prev.next=inputNode;	
					inserted=true;
				}
				
				else {
					if (next.next!=null){
					next=next.next;
					}
					else {
						limitReached=true;
					}
				}
				
				
			}
			
			if (inserted==false){
				Node newNode=new Node(input,next,null);
				next.next=newNode;
			}
		}
		
	}
	
	public boolean checkSize(int stackNum){
		boolean stackIsFull=false;
		int sizeOfStack= data.length/index.length;
		
		if (index[stackNum-1]>=((stackNum)*sizeOfStack)){
			stackIsFull=true;
		}
		
		return stackIsFull;
		
	}
	
	public int peek(int stackNum){
		int output=0;
		
		int sizeOfStack=data.length/index.length;
		
		if (data[index[stackNum-1]-1]== (sizeOfStack*(stackNum-1))){
			return output;
		}
		
		output=data[index[stackNum-1]-1];
		
		return output;
		
	}
	
	public int pop(int stackNum){
		int output=0;
		
		int sizeOfStack=data.length/index.length;
		
		if (data[index[stackNum-1]-1]== (sizeOfStack*(stackNum-1))){
			return output;
		}
		
		output=data[index[stackNum-1]-1];
		
		removeFromMin(output,stackNum);
		data[index[stackNum-1]-1]=0;
		index[stackNum-1]--;
		
		return output;
		
	}
	
	public void alterIndex(int numOfStack){	
			index[numOfStack-1]++;	
	}
	
	public void removeFromMin(int output, int stackNum){
		Node next=min[stackNum-1].head.next;
		boolean removed=false;
		
		while (next!=null && removed==false){
		if (next.value==output){
			if (next.next!=null){
			next.prev.next=next.next;
			next.next.prev=next.prev;
			}
			else{
				next.prev.next=null;
			}
			removed=true;
		}
		else {
			next=next.next;
		}
		}
	}
	
	
	public void printStackValues(int stackNum){
		
		int endOfStack=index[stackNum-1];
		int startOfStack=(data.length/index.length)*(stackNum-1);
		
		System.out.println("Printing for Stack number "+stackNum+":");
		
		for (int i=startOfStack;i<endOfStack;i++){
			System.out.println(data[i]);
		}
		
		
	}
	
	
	public void printMinimum(int stackNum){
		
		Node next=min[stackNum-1].head.next;
		
		if (next==null){
		System.out.println("There is no minimum");
		}
		
		while (next!=null){
			System.out.println(next.value);
			next=next.next;
			
		}
	}
	
	

	
}
