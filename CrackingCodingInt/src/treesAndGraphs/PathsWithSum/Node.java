package treesAndGraphs.PathsWithSum;

public class Node {
	
	Integer val;
	Node left;
	Node right;
	
	public Node(Node left, Node right, Integer val){
		this.left=left;
		this.right=right;
		this.val=val;
	}

	public Integer getVal() {
		return val;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	

	
	
}
