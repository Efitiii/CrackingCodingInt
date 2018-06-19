package treesAndGraphs.ProjectPriority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	
	List<Project> nodes;
	Map<String, Project> map;
	
	Graph(){
		nodes= new ArrayList<Project>();
		map= new HashMap<String,Project>();
	}
	
	public Project addOrGetNode(String name){
		
		if (!map.containsKey(name)){
			Project newProject= new Project(name);
			nodes.add(newProject);
			map.put(name, newProject);
		}
		
		return map.get(name);
		
	}
	
	
	public void addDependency(Project mainProject, Project dependentProject){
		if (!map.containsKey(mainProject.getName())){
			nodes.add(mainProject);
			map.put(mainProject.getName(), mainProject);	
		}
		
		mainProject.addOrGetChild(dependentProject);
	}

}
