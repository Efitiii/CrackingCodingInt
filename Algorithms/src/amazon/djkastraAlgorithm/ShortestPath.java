package amazon.djkastraAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestPath {
	
	public List<List<Integer>> findShortestPath(List<List<Integer>> coordinates){
		
		List<List<Integer>> output= new ArrayList<List<Integer>>();
		List<Integer> startingCoordinate=new ArrayList<Integer>();
		startingCoordinate.add(0);
		startingCoordinate.add(0);
		Map<List<Integer>, Integer> visitedCoordinates= new HashMap<List<Integer>, Integer>();
		output.add(startingCoordinate);
		visitedCoordinates.put(startingCoordinate, 0);
		
		return searchForPath(coordinates,startingCoordinate, output, visitedCoordinates);
		
		
	
	}
	
	
	
	public List<List<Integer>> searchForPath(List<List<Integer>> coordinates, List<Integer> currentCoordinate, List<List<Integer>> output, Map<List<Integer>, Integer> visitedCoordinates){
		
		if (output.size()== coordinates.size()){
			return output;
		}
		
		
		MyMinHeap minHeap= new MyMinHeap();
		
		if (coordinates.size()==0){
			return output;
		}
		
		
		Integer x1= currentCoordinate.get(0);
		Integer y1= currentCoordinate.get(1);
		
		coordinates.forEach(coord->{
			
			if (!visitedCoordinates.containsKey(coord)){
			Integer x2= coord.get(0);
			Integer y2= coord.get(0);
			
			Integer sqrDiffX=(x2-x1)*(x2-x1);
			Integer sqrDiffY=(y2-y1)*(y2-y1);
			
			Integer distance= (int) Math.sqrt(sqrDiffX+sqrDiffY);
			List<Integer> coorDist= new ArrayList<Integer>();
			coorDist.addAll(coord);
			coorDist.add(distance);
			
			minHeap.insert(coorDist);
			
			}
		});
		
		List<Integer> currentShortestCoordinate= minHeap.pickMin();
		output.add(currentShortestCoordinate);
		currentShortestCoordinate.set(2, 0);
		visitedCoordinates.put(currentShortestCoordinate, currentShortestCoordinate.get(2));
		
		searchForPath(coordinates,currentShortestCoordinate, output, visitedCoordinates);
		
		return output;
	}
	
}
