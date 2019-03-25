package heap.maxHeap;

import java.util.ArrayList;
import java.util.List;

public class MyMaxHeap {
	
	List<Integer> myMaxHeap;
	
	public MyMaxHeap(){
		myMaxHeap= new ArrayList<Integer>();
	}
	
	public void insert(Integer input){
		if (this.myMaxHeap.size()==0){
			myMaxHeap.add(input);
		}
		
		else {
			int i=0;
			boolean inserted=false;
			
			while (inserted==false){
				if (myMaxHeap.get(0)<input){
					maxHeapify(0);
					myMaxHeap.set(0,input);
					inserted=true;
					i++;
				}
				else{
					Integer index1= 2*i+1;
					Integer index2= 2*i+2;
					inserted=insertByTraversing(index1,index2,input);
				    i++;
				}
			}
		}
		
		
	}
	
	
	
	
	public boolean insertByTraversing(Integer index1,Integer index2, Integer input){
		
		if (index1<myMaxHeap.size()){
		if (this.myMaxHeap.get(index1)>input){
			if (index2<myMaxHeap.size()){
				if (this.myMaxHeap.get(index2)>input){
					return false;
				}
		}
			else {
				myMaxHeap.add(input);
				return true;
			}
		}	
		else if (this.myMaxHeap.get(index1)<input){
			//Integer valueToBePeeled=myMaxHeap.get(index1);
			//myMaxHeap.remove(index1);
			//myMaxHeap.set(index1,input);
			//int u=0;
			//Integer index1New= 2*index1+1;
			//Integer index2New= 2*index1+2;
			//insertByTraversing(index1+1, index1+1, valueToBePeeled);
			//insertByTraversing(index1New, index2New, valueToBePeeled);
			
			
			maxHeapify(index1);
			myMaxHeap.set(index1,input);
			
		     return true;
		}
		
		else if (this.myMaxHeap.get(index2)<input){
			
//			Integer valueToBePeeled=myMaxHeap.get(index2);
//			//myMaxHeap.remove(index2);
//			myMaxHeap.set(index2,input);
//			int u=0;
//			Integer index1New= 2*index2+1;
//			Integer index2New= 2*index2+2;
//			insertByTraversing(index1New, index2New, valueToBePeeled);
			
			maxHeapify(index2);
			myMaxHeap.set(index2,input);
			return true;
			}
		
		}
		else{
			myMaxHeap.add(input);
			return true;
		}
		
		return false;
	}
	
	
	public void maxHeapify(int pos){
		
		for (int i=myMaxHeap.size()-1;i>=pos;i--){
			if (i==myMaxHeap.size()-1){
				myMaxHeap.add(myMaxHeap.get(myMaxHeap.size()-1));
			}
			else {
				myMaxHeap.set(i+1, myMaxHeap.get(i));
			}
		}
		
	}
	
	
	
	
	@Override
	public String toString(){
		
		
		StringBuilder finalStr= new StringBuilder();
		
		int i=0;
		int count=1;
		int h=0;
		
		while (i<myMaxHeap.size()){
			int index1= 2*i+2;
			int index2= 2*i+1;
			StringBuilder str= new StringBuilder();
			str.append(myMaxHeap.get(i));
			str.append("\n");
			str.append("/"+"  "+"\\");
			
			finalStr.append(str.toString());
			
			if (Math.pow(2, h)==count){
				finalStr.append("\n");
				h=h+1;
				count=0;
			}
			count++;
			i++;
			
		}
		
		return finalStr.toString();
	}

	public List<Integer> getMyMaxHeap() {
		return myMaxHeap;
	}

}
