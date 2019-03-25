package treesAndGraphs.PathsWithSum;

public class MyBinaryTree {
	
	Node root;
	boolean switchTree;
	StringBuilder str;
	
	
	public MyBinaryTree(Integer val){
		this.root=new Node(null, null, val);
		this.switchTree=true;
		this.str= new StringBuilder();
	}
	

	public Node getRoot() {
		return root;
	}
	
	
	
	public void addValueToTree(Integer val){
		 Node newNode= new Node(null,null,val);
		 addNodeToTree(root,newNode);
		
	}
	
	private Node addNodeToTree(Node currentNode, Node newNode){
				
		if (currentNode.getLeft()==null){
			currentNode.setLeft(newNode);	
			return currentNode;
		
		}
		
		else if (currentNode.getRight()==null){
			currentNode.setRight(newNode);
			return currentNode;
		}
		
		if (this.switchTree){
		addNodeToTree(currentNode.getLeft(), newNode);
		this.switchTree=false;
		}
		else{
		addNodeToTree(currentNode.getRight(), newNode);
		this.switchTree=true;
		}	
		
		return currentNode;
	}
	
	@Override
	public String toString(){
		return traverseTree(this.root);
		
	}
	
	public String traverseTree(Node root){
		
		Node leftRoot= root.getLeft();
		Node rightRoot= root.getRight();
//		
////		if (root!=null){
////			buildString(root);
////			
////			if (leftRoot!=null){
////				buildString(leftRoot);
////			}
////			if (rightRoot!=null){
////				buildString(rightRoot);
////			}
	    
		
		String strLeft="";
		String strRight="";
		StringBuilder str= new StringBuilder();
		
		if (root.left==null && root.right==null){
			return root.getVal().toString();
		}
		
		if (root.left!=null){
	        strLeft=  traverseTree(leftRoot);
		}

		if (root.right!=null){ 
		   strRight= traverseTree(rightRoot);
		}
		
		str.append(root.getVal());
		str.append("\n");
		str.append("/").append("  ").append("\\");
		str.append("\n");
		//append new line
		str.append(strLeft);
		str.append("  ");
		str.append(strRight);
		

		return str.toString();
	//String leftString= buildString()	
		
	}
		
		
		
	
	
	public String buildString(Node root){
		
		//if ()
		
		this.str.append(root.getVal());
		
		return null;
	}
	

}
