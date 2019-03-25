package amazon.buildDestinationsFromCoordinates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildDestinationDijkstra {
	
	Map<List<Integer>,Boolean>  mapVisitedDestinations=null;
	
	BuildDestinationDijkstra(){
		mapVisitedDestinations= new HashMap<List<Integer>, Boolean>();
	}
	
	public List<List<Integer>> buildDestinations(List<List<Integer>> coordinates){
		
		List<List<Integer>>  output=new ArrayList<List<Integer>>();
		
		List<Integer> newCoordinate1= coordinates.get(0);
		Map<List<Integer>,Double> newCoordinateMap=findShortestPaths(newCoordinate1, coordinates, output);
		List<Integer> newCoordinate2= newCoordinateMap.entrySet().iterator().next().getKey();
		
		mapVisitedDestinations.put(newCoordinate2, true);
		output.add(newCoordinate2);
		
		while (output.size()<coordinates.size()){
		Map<List<Integer>, Double> newCoordinate3Map=findShortestPaths(newCoordinate1, coordinates, output);
		Map<List<Integer>,Double> newCoordinate4Map= findShortestPaths(newCoordinate2, coordinates, output);
		Double newCoordinate3Dist= newCoordinate3Map.entrySet().iterator().next().getValue();
		Double newCoordinate4Dist= newCoordinate4Map.entrySet().iterator().next().getValue();
		List<Integer> newCoordinate3= newCoordinate3Map.entrySet().iterator().next().getKey();
		List<Integer> newCoordinate4= newCoordinate4Map.entrySet().iterator().next().getKey();
		
		if (newCoordinate3Dist<=newCoordinate4Dist){
			
			mapVisitedDestinations.put(newCoordinate3, true);
			output.add(newCoordinate3);
			newCoordinate1=newCoordinate3;
			
		} else{
			mapVisitedDestinations.put(newCoordinate4, true);
			output.add(newCoordinate4);
			newCoordinate2=newCoordinate4;
		}
					
		}
		
		
		return output;
	}
	
	
	public Map<List<Integer>, Double> findShortestPaths(List<Integer> currCoordinate, List<List<Integer>> coordinates, List<List<Integer>>  output){
	
		int x1= currCoordinate.get(0);
		int y1= currCoordinate.get(1);
		Map<List<Integer>,Double> prevMinValue= new HashMap<List<Integer>, Double>();
		
		
	coordinates.forEach(coor->{
		if (!mapVisitedDestinations.containsKey(coor)){
			int x2= coor.get(0);
			int y2= coor.get(1);
			
			int diffSqrX= (x2-x1)*(x2-x1);
			int diffSqrY= (y2-y1)*(y2-y1);
			
			Double minDiff= Math.sqrt(diffSqrX+diffSqrY);
			
			if (prevMinValue.size()==0){
				
				prevMinValue.put(coor, minDiff);
				
			}
			else if (prevMinValue.entrySet().iterator().next().getValue()>minDiff) {
				prevMinValue.remove(prevMinValue.entrySet().iterator().next().getKey());
				prevMinValue.put(coor, minDiff);
			}
			
		}
		
	});
	
	
	
	List<Integer> newCoordinate= prevMinValue.entrySet().iterator().next().getKey();
	Double finalMinDistance =  prevMinValue.entrySet().iterator().next().getValue();
	Map<List<Integer>, Double> outputMap= new HashMap<List<Integer>, Double>();
	outputMap.put(newCoordinate,finalMinDistance);
	
	
	
	//mapVisitedDestinations.put(newCoordinate, true);
   // output.add(newCoordinate);
	return outputMap;
	
	
	}

}
