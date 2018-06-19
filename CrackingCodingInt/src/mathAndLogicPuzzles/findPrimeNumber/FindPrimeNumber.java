package mathAndLogicPuzzles.findPrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumber {
	
	public List<Integer> findAllPrime(int max){
		List<Integer> listOfPrimes= new ArrayList<Integer>();
		boolean[] arrOfPrimes= new boolean[max];
		
		for (int i=0;i<max;i++){
			arrOfPrimes[i]=true;
		}
		
		int prime=2;
		boolean hasBeenVisited=false;
		
		while (prime<=Math.sqrt(max)){
			if (prime==2 && hasBeenVisited==false){
				falsifyNotPrimes(prime, arrOfPrimes);
				hasBeenVisited=true;
			}
			else{
			
			prime= findNextPrime(prime, arrOfPrimes);
			falsifyNotPrimes(prime, arrOfPrimes);
			}
		}
		
		return listOfPrimes;
	}
	
	public int findNextPrime(int prime, boolean[] arrOfPrimes){
		
		int i=prime+1;
		
		
		while (arrOfPrimes[i]==false){
			i++;
		}
		
		if (arrOfPrimes[i]==true){
			prime=i;
		}
		
		return prime;
	}
	
	public void falsifyNotPrimes(int prime, boolean[] arrOfPrimes){
		
		for (int i=prime*prime;i<arrOfPrimes.length;i+=prime ){
			arrOfPrimes[i]=false;
		}
		
	}

}
