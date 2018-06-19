package treesAndGraphs.minimaltree;

public class MinimalTree {
	
	MyBinaryTree myTree;
	
	MinimalTree(){
		this.myTree=new MyBinaryTree();
	}
	
	// [1,2,3,4,5,6,7] = n  
	
	public void saveInBST(Integer[] input){
		 //4               1   0
	//3        5          3   1     n=2(h+1)-1  ln(n+1)-1=h
//2		3.5 4.5  5.5      7   2    
		
		   //4
	//2           //6
//1	    //3	  //5     //7
		
//		Integer mid;
//		
//		mid=input.length/2;
//		
//		myTree.add(input[mid]);
		
		addToTree(input,0,input.length);
		//myTree.printMyTree();
		
	   
	}
	
	public void addToTree(Integer[] input, int start, int end){
		
	Integer mid=start + (end-start)/2;
	
	if ((end-start)==0){
		myTree.add(input[end]);
	}
		
	myTree.add(input[mid]);
	
	addToTree(input,start,mid-1);
	addToTree(input,mid+1,end);
	
		
	}

}
