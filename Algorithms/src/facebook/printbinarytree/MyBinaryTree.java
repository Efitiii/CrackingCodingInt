package facebook.printbinarytree;

import facebook.printbinarytree.Node;

public class MyBinaryTree {
	
	Node root;
	
	MyBinaryTree(){
		this.root= new Node (null,null,null);
	}
	
	public void add(Character newVal){
		
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
	
	
	public void iterateLeft(Node currentNode,Character newVal){
	
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

	
	public void iterateRight(Node currentNode, Character newVal){
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


}
