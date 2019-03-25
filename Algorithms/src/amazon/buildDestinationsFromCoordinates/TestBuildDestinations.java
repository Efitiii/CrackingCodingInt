package amazon.buildDestinationsFromCoordinates;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestBuildDestinations extends TestCase {

	
	@Test
	public void testBuilDestinations(){
		
		BuildDestinations build= new BuildDestinations();
		BuildDestinationDijkstra buildD= new BuildDestinationDijkstra();
		
		List<Integer> c1= new ArrayList<>();
		c1.add(0);
		c1.add(0);
		
		List<Integer> c2= new ArrayList<>();
		c2.add(7);
		c2.add(7);
		
		List<Integer> c3= new ArrayList<>();
		c3.add(4);
		c3.add(4);
		
		List<Integer> c4= new ArrayList<>();
		c4.add(3);
		c4.add(3);
		
		List<List<Integer>> coordinates= new ArrayList<List<Integer>>();
		coordinates.add(c1);
		coordinates.add(c2);
		coordinates.add(c3);
		coordinates.add(c4);
		
		
		//List<List<Integer>> output= build.buildRouteOfTruck(coordinates);
		List<List<Integer>> output= buildD.buildDestinations(coordinates);
		
		output.forEach(listC->{
			listC.forEach(x->System.out.print(x));
			System.out.println("");
		});
		
		
	}
}
