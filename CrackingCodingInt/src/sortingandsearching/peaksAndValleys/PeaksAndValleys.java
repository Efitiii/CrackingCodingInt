package sortingandsearching.peaksAndValleys;

import java.util.LinkedList;
import java.util.Queue;

public class PeaksAndValleys {

	public Integer[] sortInPeaksValleysEfficient(Integer[] input){

		if (input.length==1 || input.length==2)
			return input;

		boolean findPeak=false;

		if(input[0]>input[1])
			findPeak=true;

		for (int i=1; i<input.length-1;i++){
			if (input[i] < input[i+1] && findPeak==false){
			    input[i]=input[i]*input[i+1];
			    input[i+1]=input[i]/input[i+1];
			    input[i]=input[i]/input[i+1];
			    findPeak=true;
            }
            else if (input[i]>input[i+1] && findPeak==true){
				input[i]=input[i]*input[i+1];
				input[i+1]=input[i]/input[i+1];
				input[i]=input[i]/input[i+1];
				findPeak=false;
			}
			else{
				findPeak=!findPeak;
			}


		}
		return input;

	}
	
	
	public Integer[] sortInPeaksValleys(Integer[] input){

		  if (input.length<=2){
		  return input;
		}

		   Queue<Integer> queueValley= new LinkedList<Integer>();
		  Queue<Integer> queuePeak= new LinkedList<Integer>();
		  Queue<Integer> queueNon= new LinkedList<Integer>();
		 Integer[] output= new Integer[input.length];
		  boolean valleyFirst=true;
		  boolean firstFound=false;

		if (input[0]>input[1]){
		queuePeak.add(input[0]);
		valleyFirst=false;
		firstFound=true;
		}
		else if (input[0]<input[1]) { 
		queueValley.add(input[0]);
		firstFound=true;
		}
		else {
		queueValley.add(input[0]);
		}

		for (int i=1;i<input.length-1;i++){
		Integer previous= input[i-1];
		Integer next= input[i+1];

		if (input[i]>previous && input[i]>next){
		queuePeak.add(input[i]);
		if (!firstFound){
		valleyFirst=false;
		firstFound=true;
		}
		}
		else if (input[i]<previous && input[i]<next){
		queueValley.add(input[i]);
		if (!firstFound){
		firstFound=true;
		}
		}
		else {
		queueNon.add(input[i]);
		}
		}

		if (valleyFirst==true){
			
		buildStartingFrom(queueValley, queuePeak, queueNon, output);

		}
		else {
		buildStartingFrom(queuePeak,queueValley, queueNon, output);

		}

		return output;

		}


		public Integer[] buildStartingFrom(Queue<Integer> queueFirst, Queue<Integer> queueSecond, Queue<Integer> queueNon, Integer[] output){

		int i=0;
		while (queueFirst.isEmpty() || queueSecond.isEmpty()){
		output[i]=(Integer) queueFirst.remove();
		output[i+1]=(Integer) queueSecond.remove();
		i++;
		}

		int z=i;

		while (!queueFirst.isEmpty()){

		output[z]=(Integer) queueFirst.remove();
		z++;
		}

		while (!queueSecond.isEmpty()){

		output[z]=(Integer) queueSecond.remove();
		z++;
		}

		while (!queueNon.isEmpty()){

		output[z]=(Integer) queueNon.remove();
		z++;
		}


		return output;


		}


}
