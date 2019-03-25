package numberOfFactors.dani.mum;


public class NumberOfFactors {
	
	public NumberOfFactors(){
		
	}
	
	public int answerOne(int first_input, int second_input)
	{
		int factors_first_input=1;
		int factors_second_input=1;
		
		int max= Math.max(first_input, second_input);
		
		for (int i=2;i<=max;i++){
			if (i<=first_input && first_input%i==0){
				factors_first_input++;
			}
			
			if (i<=second_input && second_input%i==0){
				factors_second_input++;
			}
		}
		
		if (factors_first_input ==factors_second_input){
			return 1;
		}
		
		return 0;
	}

}
