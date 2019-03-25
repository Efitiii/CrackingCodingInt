package hackerRank.runningMedian;

import java.util.LinkedList;
import java.util.List;

public class RunningMedian {

	    public class Node{
	        Integer data;
	        Node previous;
	        Node next;

	        public Node(Integer data, Node previous, Node next){
	               this.data=data;
	               this.previous=previous;
	               this.next=next;
	        }
	    }

	    /*
	     * Complete the runningMedian function below.
	     */
	    static double[] runningMedian(int[] a) {
	        double[] medianResult= new double[a.length];
	        RunningMedian running= new RunningMedian();
	        int size=0;
	        int x=0;
	        if (a.length==0){
	            return medianResult;
	        }
	        else if (a.length==1){
	            medianResult[0]=a[0];
	            return medianResult;
	        }

	       List<Node> sortedLink = new LinkedList<>();
	       sortedLink.add( running.new Node(a[0],null,null));
	      

	       for (int i=1;i<a.length;i++){
	           Node newNode= running.new Node(a[i],null, null);
	           addValueToLink(sortedLink,newNode);
	           size++;
	          medianResult[x]=findMedian(sortedLink,size);
	          x++;
	       }
	       
	       return medianResult;
	       
	    }
	    
	    static int findMedian(List<Node> sortedLink, int size){
	    	int median=0;
	    	int mid= size/2;
	    	if (size%2==0){
	    		
	    		median = (sortedLink.get(mid).data+sortedLink.get(mid+1).data)/2;
	    		
	    	}
	    	else {
	    		median =sortedLink.get(mid).data;
	    	}
	    	
	    	return median;
	    }
	    
	    

	    static void addValueToLink(List<Node> sortedLink, Node input){
	       
	          Node slowRunner= sortedLink.get(0);
	          Node fastRunner= sortedLink.get(0).next;
	          
	          while (fastRunner.next!=null){
	        	  if (slowRunner.data>=input.data){
	        		  Node currentNode=slowRunner;
	        		  
	        		  while (currentNode.data>=input.data || currentNode.previous==null){
	        			  currentNode=currentNode.previous;
	        		  }
	        		  
	        		  if (currentNode.previous==null){
	        			  currentNode.previous=input;
	        			  input.next=currentNode;
	        		  }
	        		  else{
	        			  input.next=currentNode.next;
	        			  currentNode.next=input;
	        			  input.previous=currentNode;
	        		  }
	        		  
	        		  
	        	  }
	        	  
	        	  else if (slowRunner.data<input.data && fastRunner.data>=input.data){
	        		  
	        		  Node currentNode = (input.data-slowRunner.data>=fastRunner.data-input.data) ? fastRunner : slowRunner;
	        		  
	        		  if (currentNode.data<=input.data){
	        			  
	        			  while (currentNode.data>=input.data){
	        				  currentNode= currentNode.next;
	        			  }
	        			  
	        			  input.next=currentNode;
	        			  currentNode.previous.next=input;
	        			  input.previous=currentNode.previous;
	        			  currentNode.previous=input;
	        		  }
	        		  else if (currentNode.data>input.data){
	        			  
	        			  while (currentNode.data<=input.data){
	        				  currentNode= currentNode.previous;
	        			  }
	        			  
	        			  input.next=currentNode.next;
	        			  currentNode.next.previous=input;
	        			  input.previous=currentNode;
	        			  currentNode.next=input;
	        		  }
	        		  	  
	        	  }
	        	  
	        	  else if (fastRunner.data<=input.data){
	        		  Node currentNode= fastRunner;
	        		  
	        		  while (currentNode.data<=input.data || currentNode.next==null){
	        			  currentNode= currentNode.next;
	        		  }
	        		  
	        		  if (currentNode.next==null){
	        			  currentNode.next=input;
	        			  input.previous= currentNode;
	        		  }
	        		  else {
	        			  currentNode.previous.next=input;
	        			  input.previous=currentNode.previous;
	        			  currentNode.previous=input;
	        			  input.next=currentNode;
	        		  }
	        		  
	        		  
	        	  }
	        	        	  
	        	  
	          }
	          
	          
	        
	    }

}
