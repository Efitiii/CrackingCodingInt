package treesAndGraphs.routebetweennodes;

public class RouteBetweenTwoNodes {
	
	public boolean findRouteBetweenNodes(Integer firstN, Integer secondN, Node graph){
		boolean routeExists=false;
		boolean firstNodeFound;
		boolean secondNodeFound;
		
		firstNodeFound=findNode(firstN, graph);
		secondNodeFound= findNode(secondN, graph);
		
		if (firstNodeFound && secondNodeFound){
			routeExists=true;
		}
		
		
		return routeExists;
	}
	
	public boolean findNode(Integer firstN, Node graph){
		
		boolean nodeFound=false;
		int iterator=0;
		
		
		if (graph.getRoot().equals(firstN)){
			return true;
		}
		
		if (graph.getNode().size()==0){
			return false;
		}
		if (!graph.isVisited()){
			
			graph.setIsVisited(true);
			
		while (iterator<graph.getNode().size() && nodeFound==false){
			
			nodeFound = findNode(firstN,graph.node.get(iterator));
			
			 iterator++;
		
		}
		
		}
		
		return nodeFound;
	}
	
	

}
