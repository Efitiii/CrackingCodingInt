package treesAndGraphs.balancedTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CheckBSTBalance {
	
	//Checking if tree is balanced;
	
	              //8        l=0 r=0
	      //6   l=1       10
    //4        5    9     12
//2      4.5                   14
   //2.5
	
	Stack<Node> nodeStack;
	List<Integer> heightList;
	Integer leftHeight;
	Integer rightHeight;
	
	CheckBSTBalance(){
		this.heightList= new ArrayList<Integer>();
		this.leftHeight=0;
		this.rightHeight=0;
		this.nodeStack= new Stack<Node>();
	}
	
	
	public boolean checkBalance(MyBinaryTree myTree){
		
		boolean balance=true;
		Integer height;
		if (myTree.root.val==null){
			return balance;
		}
		
	   countHeight(myTree.root, 0);
	   
	   for (int i=0;i<this.heightList.size();i++){
		   System.out.println(heightList.get(i));
	   }
	   
	   height=this.heightList.get(0);
	    
//	   if (this.heightList.iterator().hasNext()){
//		   
//		   if (this.heightList.iterator().next()>height+1 || this.heightList.iterator().next()<height-1){
//			   balance=false;
//		   }
//	   }
	   
	   for (int i=1;i<heightList.size();i++){
		   if (heightList.get(i)>height+1 || heightList.get(i)<height-1){
			   balance=false;
		   }
	   }
		
		
		return balance;	
	}
	
	public void countHeight(Node currentNode, Integer height){
		
		if (currentNode.left==null && currentNode.right==null){
			this.heightList.add(height);
			return;
		}
		
		if (currentNode.left!=null){
			
			leftHeight=height;
			leftHeight++;
			countHeight(currentNode.left,leftHeight);
		}
		if (currentNode.right!=null){
			rightHeight=height;
			rightHeight++;
			countHeight(currentNode.right,rightHeight);
		}
		
	}
	

}
