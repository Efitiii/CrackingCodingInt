package heap.maxHeap;

public class MyMaxHeapEfficient {
	
	private Integer[] myHeap;
	private int size;
	
	MyMaxHeapEfficient(int maxSize){
		this.myHeap= new Integer[maxSize];
		this.size=0;
		myHeap[0]= Integer.MAX_VALUE;
	}
	
	
	
	public Integer[] getMyHeap() {
		return myHeap;
	}



	public void insert(Integer input){
		
		myHeap[++size]=input;
		int iterator=size;
		
		
			
		while (myHeap[iterator]>myHeap[parent(iterator)]){
			swap(iterator,parent(iterator));
			iterator=parent(iterator);
		}
		
		if (iterator!=1){
			maxHeapify(iterator);
		}
					
	}
	
	public void maxHeapify(int pos){
		
		if (isLeaf(pos))
			return;
		
		if (myHeap[pos]<myHeap[leftSidePos(pos)] || myHeap[pos]<myHeap[rightSidePos(pos)]){
			
			if (myHeap[leftSidePos(pos)]>myHeap[rightSidePos(pos)]){
			swap(pos,leftSidePos(pos));
			maxHeapify(leftSidePos(pos));
			}
		else 
			swap(pos,rightSidePos(pos));
			maxHeapify(rightSidePos(pos));
		}
		
		
	}
	
	public int extractMax(){
		int popped= myHeap[1];
		myHeap[1]=myHeap[size--];
		maxHeapify(1);
		return popped;
		
	}
	
	public boolean isLeaf(int pos){
		
		if (pos>=size/2 && pos<=size){
			return true;
		}
		return false;
		
	}
	
	
	public int leftSidePos(int pos){
		return 2*pos;
	}
	
	public int rightSidePos(int pos){
		return 2*pos+1;
	}
	
	
	
	public void swap(int ind1, int ind2 ){
		Integer temp= myHeap[ind1];
		myHeap[ind1]=myHeap[ind2];
		myHeap[ind2]=temp;
	}
	
	
	public int parent(int pos){
		return pos/2;
	}

	
	
}
