package treesAndGraphs.ProjectPriority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
	
	List<Project> children;
	Map<String,Project> map;
	String name;
	Integer dependencies;
	boolean removed;
	
	Project(String name){
		this.name=name;
		this.children=new ArrayList<Project>();
		this.map= new HashMap<String,Project>();
		this.dependencies=0;
		this.removed=false;
	}
	
	public Project addOrGetChild(Project dependentProject){
		
		if (!map.containsKey(dependentProject.getName())){
			children.add(dependentProject);
			map.put(dependentProject.getName(), dependentProject);
			incrementDependency();
		}
		
		return map.get(dependentProject.getName());
	}
	
	public void incrementDependency(){
		dependencies++;
	}
	
	public void decrementDependency(){
		dependencies--;
	}
	
	public Integer getDependency(){
		return dependencies;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setRemoved(boolean removed){
		this.removed=removed;
	}
	
	public boolean getRemoved(){
		return removed;
	}
	
	

}
