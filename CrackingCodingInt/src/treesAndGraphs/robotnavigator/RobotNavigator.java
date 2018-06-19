package treesAndGraphs.robotnavigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

public class RobotNavigator {
	
	// 0,0  0,1  0,2  0,3  // 1  1  0  1
	// 1,0  1,1  1,2  1,3 //  1  1  1  0
	// 2,0  2,1  2,2  2,3 //  1  1  1  1
	// 3,0  3,1  3,2  3,3 //  0  1  1  1
	
	Integer[][] matrix;
	LinkedList<Integer[]> path;
	Queue<Integer[]> visited;
	Map<Integer[],LinkedList<Integer[]>> listOfPaths;
	List<LinkedList<Integer[]>> result;
    Queue<LinkedList<Integer[]>> stoppedPosition;
    HashSet<Integer[]> failedPoints;
    

	
	RobotNavigator(Integer rowS, Integer columnS){
		this.matrix= new Integer[rowS][columnS];
		this.path = new LinkedList<Integer[]>();
		this.visited= new LinkedList<Integer[]>();
		this.listOfPaths=new HashMap<Integer[],LinkedList<Integer[]>>();
		this.stoppedPosition=new LinkedList<LinkedList<Integer[]>>();
		this.result= new ArrayList<LinkedList<Integer[]>>();
		this.failedPoints= new HashSet<Integer[]>();
	}
	
	public void fillValues(){
		Random random= new Random();
		for (int i=0;i<matrix.length;i++){
			for (int u=0;u<matrix.length;u++){
				
				if (random.nextDouble()<0.1){
				matrix[i][u]=0;
				}
				else{
					matrix[i][u]=1;
				}
			}
			
		}
	}
	
	public void printMatrix(){
	for (int i=0;i<matrix.length;i++){
		System.out.println();
		for (int u=0; u<matrix.length;u++){
		System.out.print(matrix[i][u]);	
		System.out.print(" ");
		}
	}
	}
	
	// 0,0  0,1  0,2  0,3  // 1  1  0  1   // 0,0 0,1 1,1 
	// 1,0  1,1  1,2  1,3 //  1  1  1  0   // 4 5 3 6 7 
	// 2,0  2,1  2,2  2,3 //  1  1  1  1
	// 3,0  3,1  3,2  3,3 //  0  1  1  1
	
	public void findShortestPath(){
		Integer[] e= new Integer[2];
		//Integer[] b= new Integer[]{-1};
		//Map<Integer[],LinkedList<Integer[]>> listOfPaths= new HashMap<Integer[],LinkedList<Integer[]>>();
		//Queue<Integer[]> stoppedPosition=new LinkedList<Integer[]>();
		//LinkedList<Integer[]> path= new LinkedList<Integer[]>();
		
		//e[0]=0;
		//e[1]=0;
		//this.visited.add(b);
        //this.visited.add(e);   
        //addValuesToQueue(this.visited);
		
		if (matrix[0][0]==1){
			if (stoppedPosition.isEmpty()){
			Integer[] currentI = new Integer[]{0,0};
    		//path.add(current);
			//this.stoppedPosition.add(path);
			comparePaths(currentI,this.path);
			}
			else{
			
			while (this.stoppedPosition.isEmpty()){
				LinkedList<Integer[]> pathN= stoppedPosition.poll();
				Integer[] current=pathN.getFirst();
				comparePaths(current,this.path);
				}
			}
		}
		else {
			System.out.println("Initial Value is not 1");
		}
			
	
        
        
   
	}
	
	
	public void comparePaths(Integer[] current, LinkedList<Integer[]> path){
		
		//LinkedList<Integer[]> path= new LinkedList<Integer[]>();
		Integer itrH=1;
		Integer itrV=1;
		Integer[] cur= current;
		boolean added=false;
		
		if (current[0]==matrix.length-1 && current[1]==matrix[0].length-1){
			
			this.result.add(path);
		}
		else{
			if ((cur[1]+itrH)<matrix.length){
			Integer[] nextPathH= new Integer[]{cur[0],cur[1]+itrH};
			
			if (matrix[cur[0]][cur[1]+itrH]!=0 && !failedPoints.contains(nextPathH) ){
        		Integer[] newPath= new Integer[]{cur[0],cur[1]};
        		
        		path.add(newPath);
        		added=true;
        		//stoppedPosition.add(cur);
        		//listOfPaths.put(newPath, path);	
        		//stoppedPosition.add(path);
        		
        		comparePaths(nextPathH, path);
        	}
        	else {
        
        		failedPoints.add(nextPathH);
        	}
			
			}
			
			
			if ((cur[1]+itrH)<matrix.length){
				Integer[] nextPathV= new Integer[]{cur[0]+itrV,cur[1]};
				
				if ((cur[0]+itrV)<matrix[0].length && matrix[cur[0]+itrV][cur[1]]!=0 && !failedPoints.contains(nextPathV)){
	        		Integer[] newPath= new Integer[]{cur[0],cur[1]};
	        		
	        		if (added==false){
	        		path.add(newPath);
	        		}
	        		//stoppedPosition.add(path);
	        		//listOfPaths.put(newPath, path);
	        		
	        		comparePaths(nextPathV,path);
	        	}
	        	
	        	else {
	    	        
	        		failedPoints.add(nextPathV);
	        	}
				}
			
	        	
	        	
	        	
	        	
		}
	}
	
	
	public void printPaths(){
		if (result.isEmpty()){
			System.out.println("There is nothing to print");
		}
		else {
			while(result.iterator().hasNext()){
				LinkedList<Integer[]> val=result.iterator().next();
			    
				while (val.iterator().hasNext()){
					Integer[] arr= val.iterator().next();
					System.out.println("["+arr[0]+","+arr[1]+"] => ");
				}
			}
		}
	}
	
	public void addValuesToQueue(Queue<Integer[]> record){
		Integer count=0;
		Queue<Integer[]> temp= new LinkedList<Integer[]>();
		boolean limitReached=false;
		
		while (limitReached==false){
		Integer[] cur= record.iterator().next();
		
		if (cur[0]!=-1){
		temp.add(cur);
		}
		else{
			limitReached=true;
		}
				
		}
		
		Integer[] edgevalue= new Integer[]{-1};
		visited.add(edgevalue);
		
		while(!temp.isEmpty()){
		Integer[] current=temp.poll();
		if (current[1]+1<matrix[current[0]].length){
			Integer[] a=new Integer[]{current[0],current[1]+1};
			visited.add(a);
		}
		
		if (current[0]+1<matrix.length){
		   Integer[] b= new Integer[]{current[0]+1, current[1]};
		   visited.add(b);
		}
		}
    	
    }
	

}
