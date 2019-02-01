package treesAndGraphs.ProjectPriority;

public class ProjectPriority {
	
 public Project[] orderByPriority(String[] projects, Project[][] dependencies){
	 
	 Project[] ordered= new Project[projects.length];
	 Graph graph= new Graph();
	 Graph graphDependencies= new Graph();
	 Integer index=0;
	 
	 for (String project: projects){
		 graph.addOrGetNode(project);
		 graphDependencies.addOrGetNode(project);
	 }
	 
	 for (Project[] project:dependencies){
		 Project mainProject= project[0];
		 Project dependentProject= project[1];
		 
		 graph.addDependency(mainProject, dependentProject);
		 graphDependencies.addDependency(dependentProject, mainProject);
	 }
	 
	 
	
	 // add the Projects with no dependencies
	 
	 for (String projectName:projects){
		Project project= graph.addOrGetNode(projectName);
		
		if (project.getDependency()==0){
			ordered[index]=project;
			index++;
		}
	 }
	 
	 Integer left=projects.length-index-1;
	 
	 while (left!=0){
	 for (String project:projects){
		 Project currentP= graphDependencies.addOrGetNode(project);
		 if (currentP.dependencies==0 && currentP.getRemoved()==false){
			 ordered[index]=currentP;
			 currentP.setRemoved(true);
			 left--;
			 index++;
			 
			Project mainProject= graph.addOrGetNode(currentP.getName());
			
			while (mainProject.children.iterator().hasNext()){
				Project dependentProject=mainProject.children.iterator().next();
				Project dependentProjectDependencies= graphDependencies.addOrGetNode(dependentProject.getName());
				boolean found=false;
				int i=0;
				
				while(found==false){
				
				if (dependentProjectDependencies.children.get(i)==currentP){
					
					dependentProjectDependencies.children.add(i,null);
					dependentProjectDependencies.decrementDependency();
					found=true;
				}
				i++;
				}
			}
			 
		 }
		 
	 }
 }
	 
	 
	 return ordered;
 }

}
