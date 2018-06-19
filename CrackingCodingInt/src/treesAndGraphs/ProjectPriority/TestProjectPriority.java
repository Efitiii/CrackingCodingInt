package treesAndGraphs.ProjectPriority;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestProjectPriority extends TestCase {

	@Test
	public void testPriority(){
		String[] projects=new String[]{"A","D","B","C","F"};
		Project A= new Project("A");
		Project B= new Project("B");
		Project C= new Project("C");
		Project D= new Project("D");
		Project E= new Project("E");
		Project F= new Project("F");
		Project[][] dependencies= new Project[][]{{A,C},{D,C},{B,D},{C,E},{A,B}};
		
		
		ProjectPriority priority= new ProjectPriority();
		Project[] order=priority.orderByPriority(projects, dependencies);
		
		for (Project project:order){
			System.out.println(project.getName()); 
			
		}
	}
}
