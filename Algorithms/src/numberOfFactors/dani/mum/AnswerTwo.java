package numberOfFactors.dani.mum;


public class AnswerTwo {
	
	public AnswerTwo(){}
	
	public int answerTwo(int[] input){
		
		int sum=0;
		boolean true_a_array=true;
		int i=0;
		
	
		if (input.length==0){
			return 0;
		}
		
		while (i<input.length && true_a_array==true){
			if (input[i]>=i){
				true_a_array=false;
			}
			else {
				sum+=input[i];
			}
			i++;
		}
		
		if (true_a_array==true && sum==0){
			return 1;
		}		
		return 0;
	}

}
