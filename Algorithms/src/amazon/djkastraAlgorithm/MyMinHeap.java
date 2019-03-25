package amazon.djkastraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MyMinHeap {
	
	List<List<Integer>> myMinHeap;
	
	public MyMinHeap(){
		this.myMinHeap= new ArrayList<List<Integer>>();
		List<Integer> startingCoord= new ArrayList<Integer>();
        startingCoord.add(0);
        startingCoord.add(0);
        startingCoord.add(Integer.MIN_VALUE);
		myMinHeap.add(startingCoord);
		
	}
	
	
	
	public void insert(List<Integer> input){
		
		myMinHeap.add(input);
		Integer current= myMinHeap.size()-1;
		
		while (myMinHeap.get(current).get(2)<myMinHeap.get(parent(current)).get(2)){
			
			swap(current, parent(current));
			current=parent(current);
			
		}
		
		
		
	}
	
	public void minHeapify(Integer pos){
		
		if (isLeaf(pos)){
			return;
		}
		
		Integer rootDistance= myMinHeap.get(pos).get(2);
		Integer leftDistance= myMinHeap.get(getLeft(pos)).get(2);
		Integer rightDistance= myMinHeap.get(getRight(pos)).get(2);
		
		if (rootDistance<leftDistance || rootDistance<rightDistance){
			
			if (leftDistance<rightDistance){
				swap(pos, getLeft(pos));
				minHeapify(getLeft(pos));
			}
			else{
				swap(pos, getRight(pos));
				minHeapify(getRight(pos));
			}
			
		}
		
		
	}
	
	private boolean isLeaf(int pos){
		if (pos>=myMinHeap.size()/2 && pos<myMinHeap.size()){
			return true;
		}
		
		return false;
	}
	
	
	
	public List<Integer> pickMin(){
		List<Integer> output= myMinHeap.get(1);
		myMinHeap.set(1, myMinHeap.get(myMinHeap.size()-1));
		minHeapify(1);
		
		return output;	
	}
	
	private int getLeft(int pos){
		return 2*pos;
	}
	
	private int getRight(int pos){
		return 2*pos+1;
	}
	
	
	
	private int parent(Integer pos){
		return pos/2;
	}
	
	private void swap(Integer ind1, Integer ind2){
		List<Integer> temp= myMinHeap.get(ind1);
		myMinHeap.set(ind1, myMinHeap.get(ind2));
		myMinHeap.set(ind2,temp);
	}
	
	
	

}
