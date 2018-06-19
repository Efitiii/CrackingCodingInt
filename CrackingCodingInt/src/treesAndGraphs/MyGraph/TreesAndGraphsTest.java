package treesAndGraphs.MyGraph;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TreesAndGraphsTest extends TestCase {
	
	@Test (enabled=false)
	public void testLinkedList(){
	  MyLinkedList mylink= new MyLinkedList();
	  mylink.add(1);
	  mylink.add(2);
	  mylink.add(3);
	  mylink.add(4);
	  
	  mylink.remove(2);
	  mylink.remove(1);
	  mylink.remove(3);
	  
	  System.out.println(mylink.toString(","));
	}
	
	@Test
	public void testGraph(){
	GraphBidirectional graphBidirectional= new GraphBidirectional();
	  graphBidirectional.addNode(1,2);
	  graphBidirectional.addNode(1,3);
	  graphBidirectional.addNode(1,4);
	  graphBidirectional.addNode(2,3);
	  graphBidirectional.addNode(4, 1);
	  graphBidirectional.addNode(20, 50);
	  graphBidirectional.addNode(30, 40);
	  graphBidirectional.addNode(30, 60);
	  
	  System.out.println(graphBidirectional.toString("=>"));
	}

}
