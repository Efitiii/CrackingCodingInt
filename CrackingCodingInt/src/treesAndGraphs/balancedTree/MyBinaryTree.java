package treesAndGraphs.balancedTree;

public class MyBinaryTree {
	
	Node root;
	StringBuilder str;
	Integer count;
	
                   //8
            //6          10
      //4        5    9     12
   //2                         14

	
	MyBinaryTree(){
		this.root=new Node(null,null,null);
		this.str=new StringBuilder();
		this.count=2;
	}
	
	public void add(Integer newVal){
	
		if (this.root.val==null){
			this.root.val=newVal;
		}
		else{
			if (newVal<root.val){			
			iterateLeft(this.root,newVal);			 
			}
			else {
				iterateRight(this.root,newVal);
			}
		}
	}
	
	
	public void iterateLeft(Node currentNode,Integer newVal){
	
		if (currentNode.left==null) { 
			currentNode.left=new Node(newVal,null,null);
		}
		else{
			if (currentNode.left.val>newVal){

			iterateLeft(currentNode.left,newVal);

			}
			else {
				iterateRight(currentNode.left,newVal);
			}
		}
	
	}

	
	public void iterateRight(Node currentNode, Integer newVal){
		if (currentNode.right==null){
			currentNode.right=new Node(newVal,null,null);
		}
		else{
			if (currentNode.right.val<newVal){
				iterateRight(currentNode.right,newVal);
			}
			else{
				iterateLeft(currentNode.right,newVal);
			}
		}
		
	}
	
	
	public void printMyTree(Node currentNLeft, Node currentNRight){
		
		//String space="                             ";
		//str.append(space).append(root.val).append(space);
		
		
//		if (currentN.val!=null){
//		str.append(createNode(currentN));
//		str.append("/n");
//		}
		
		//if (root.left)
		
		   //      5 
		  //2               7  
	  //1     3         6         8 
 //0.5 1.5 2.5 3.5   5.5 6.5  7.5   8.5
		
		if (currentNLeft.left!=null){	
			createNode(currentNLeft.left);
		}
		
		if (currentNRight.right!=null){
			createNode(currentNLeft.right);
		}
		
		if (currentNRight.left!=null){	
			createNode(currentNRight.left);
		}
		
		if (currentNRight.right!=null){	
			createNode(currentNRight.right);
		}
		
		
		
		
	}
	
	public StringBuilder createNode(Node currentN){
		StringBuilder newBuild= new StringBuilder();
		String space="         ";
		str.append("/n");
		
		
		
		if (currentN.left!=null){
			newBuild.append(space.substring(0, space.length()/3)).append(currentN.val).append(space.length()/3);

		}
		
		if (currentN.right!=null){
			newBuild.append(space.substring(0, space.length()/3)).append(currentN.val).append(space.length()/3);
		}
		
		
		
		
		
		str.append(newBuild);
		
		
	   return  newBuild.append(space.substring(0, space.length()/3)).append(currentN.val).append(space.length()/3);
		
		
	}
	

}
