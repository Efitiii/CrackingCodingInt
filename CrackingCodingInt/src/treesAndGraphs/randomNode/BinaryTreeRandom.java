package treesAndGraphs.randomNode;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BinaryTreeRandom {
	
	Node root;
	int size;
	
	public BinaryTreeRandom(){
		this.root= new Node(null, null, null,0,0);
		this.size=0;
	}
	
	
	     //  6
	    //3     9
    //1    5 7   10
  //0   2	
	
	public void insert(Node in){
		
		if (root==null){
			root=in;
			size++;
		}
		
		else insertNodeByTraversing(root, in);
		     if (root.getLeft()!=null){
		    	 root.setNodesLeft(root.getLeft().getNodesLeft()+ root.getLeft().getNodesRight());
		     }
		     if (root.getRight()!=null){
		    	 root.setNodesRight(root.getRight().getNodesLeft()+ root.getRight().getNodesRight());
		     }
	}
	
	
	public void insertNodeByTraversing(Node current, Node in){
		
       if (current.getLeft()==null && current.getVal()>=in.getVal()){
			current.setLeft(in);
			current.setNodesLeft(current.getNodesLeft()+1);
			size++;
			return;
		}
       
       else  if (current.getRight()==null && current.getVal()<in.getVal()){
			current.setRight(in);
			current.setNodesRight(current.getNodesRight()+1);
			size++;
			return;
		}
       
       if (current.getLeft()!=null && current.getVal()>=in.getVal()){
           insertNodeByTraversing(current.getLeft(),in);
       }else if (current.getRight()!=null && current.getVal()<in.getVal()){
    	   insertNodeByTraversing(current.getRight(),in);
       }
		
	}
	
	
	public Integer generateRandom(){
		
		if (size==0){
			return null;
		}
		
		else if (size==1){
			return root.getVal();
		}
		
	    Random random= new Random();
	    Integer randomNum= random.nextInt((size-1)+1);
		generateRandomByTraversing(root,randomNum);
		
	
		return null;
	}
	
	
	public Integer generateRandomByTraversing(Node current, Integer randomNum){
		
		Integer nodesLeft= current.getNodesLeft();
		Integer nodesRight= current.getNodesRight();
		Integer totalNodes= nodesLeft+nodesRight+1;
		//Integer currentNodeValue=nodesLeft+1;
		
//		if (totalNodes==2){
//			if (randomNum==totalNodes/2)
//				return current.getVal();
//			
//			//(Node node=current.getLeft()!=null) ? current.getLeft().getVal() : current.getRight().getVal();
//		}
		
		if (randomNum<=nodesLeft){
			generateRandomByTraversing(current.getLeft(),randomNum);
		}
		
		else if (randomNum>nodesLeft && randomNum<=totalNodes){
			generateRandomByTraversing(current.getRight(),randomNum-(current.getNodesLeft()+1));
		}
		//else if (randomNum==currentNodeValue)
		      return current.getVal();
		
			
	}

	
}
