package treesAndGraphs.routebetweennodes;

import java.util.ArrayList;

public class Node {
	
	ArrayList<Node> node;
	Integer root;
	boolean visited;
	
	Node(Integer root){
		node = new ArrayList<Node>();
		this.root=root;
		this.visited=false;
		
	}

	public ArrayList<Node> getNode() {
		return node;
	}

	public Integer getRoot() {
		return root;
	}

	public boolean isVisited() {
		return visited;
	}
	
	public void setIsVisited(boolean isVisited){
		this.visited=isVisited;
	}
	
	

}
