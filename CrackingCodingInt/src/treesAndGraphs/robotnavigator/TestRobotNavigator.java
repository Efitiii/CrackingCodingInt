package treesAndGraphs.robotnavigator;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestRobotNavigator extends TestCase {

	@Test
	public void testRobotNavigator(){
		RobotNavigator robo= new RobotNavigator(5,5);
		robo.fillValues();
		robo.printMatrix();
		robo.findShortestPath();
		robo.printPaths();
		
	}
}
