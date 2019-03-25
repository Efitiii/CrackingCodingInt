package amazon.buildDestinationsFromCoordinates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildDestinations {
	
	
	public List<List<Integer>> buildRouteOfTruck(List<List<Integer>> coordinates){
		
		List<List<Integer>>  output= new ArrayList<List<Integer>>();
		
		if (coordinates.size()==0){
			return output;
		}
		
		List<Integer> coord=coordinates.get(0);
		Map<List<Integer>,Boolean> visitedCoor= new HashMap<List<Integer>,Boolean>();
		visitedCoor.put(coord, true);
		output.add(coord);
		
		
		findShortestDistanceToCoordinate(coord,coordinates,visitedCoor, output);
		
		return output;
	}
	
	
	public List<List<Integer>> findShortestDistanceToCoordinate(List<Integer> coord, List<List<Integer>> coordinates,Map<List<Integer>,Boolean> visitedCoor, List<List<Integer>>  output){
		
		if (output.size()==coordinates.size()){
			return output;
		}
		
		int x1= coord.get(0);
		int y1= coord.get(1);
		Double[] minDistanceMap= new Double[3];
		minDistanceMap[0]=0.00;
		minDistanceMap[1]=0.00;
		minDistanceMap[2]=0.00;
		
		coordinates.forEach(coor->{
			if (!visitedCoor.containsKey(coor)){
				int x2=coor.get(0);
				int y2=coor.get(1);
				
				int sqrtDiffX= (x2-x1)*(x2-x1);
				int sqrtDiffY= (y2-y1)*(y2-y1);
				
				Double minDistance= Math.sqrt(sqrtDiffX+sqrtDiffY);
				//Map<List<Integer>, Double> minMap= new HashMap<List<Integer>, Double>();
				//minMap.put(coor, minDistance);
				
				if (minDistanceMap[0]==0.00 && minDistanceMap[1]==0.00 && minDistanceMap[1]==0.00){
					
					minDistanceMap[0]= Double.valueOf(coor.get(0));
					minDistanceMap[1]= Double.valueOf(coor.get(1));
					minDistanceMap[2]=minDistance;
					
				}
				else {
					if (minDistance<minDistanceMap[2]){
						minDistanceMap[0]= Double.valueOf(coor.get(0));
						minDistanceMap[1]= Double.valueOf(coor.get(1));
						minDistanceMap[2]=minDistance;
					}
					
					
				}
					
			}
		});
		
		Integer coorX= minDistanceMap[0].intValue();
		Integer coorY= minDistanceMap[1].intValue();
		List<Integer> minCoordinate= new ArrayList<Integer>();
		minCoordinate.add(coorX);
		minCoordinate.add(coorY);
	
		visitedCoor.put(minCoordinate, true);
		output.add(minCoordinate);
		
		
		findShortestDistanceToCoordinate(minCoordinate,coordinates,visitedCoor, output);
		
		return output;
	}

}
