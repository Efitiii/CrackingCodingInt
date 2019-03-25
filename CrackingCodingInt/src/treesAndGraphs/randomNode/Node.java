package treesAndGraphs.randomNode;

public class Node {
	
	Integer val;
	Node left;
	Node right;
	Integer nodesLeft;
	Integer nodesRight;
	
	
	Node(Integer val, Node left, Node right, Integer nodesLeft, Integer nodesRight){
		this.val=val;
		this.left=left;
		this.right=right;
		this.nodesLeft=nodesLeft;
		this.nodesRight=nodesRight;
	}


	public Integer getVal() {
		return val;
	}


	public void setVal(Integer val) {
		this.val = val;
	}


	public Node getLeft() {
		return left;
	}


	public void setLeft(Node left) {
		this.left = left;
	}


	public Node getRight() {
		return right;
	}


	public void setRight(Node right) {
		this.right = right;
	}


	public Integer getNodesLeft() {
		return nodesLeft;
	}


	public void setNodesLeft(Integer nodesLeft) {
		this.nodesLeft = nodesLeft;
	}


	public Integer getNodesRight() {
		return nodesRight;
	}


	public void setNodesRight(Integer nodesRight) {
		this.nodesRight = nodesRight;
	}
	
	
	
	

}
