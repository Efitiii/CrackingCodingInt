package bigO.squareRootOfANumber;

public class SquareRootGuessing {
	
	public int findSquareRoot(int a){
		//49
		
		if (a==1){
			return 1;
		}
		
		
		int ran= a/4;
		
		return -1;
	}
	
	public int computeSquareRoot(int a, int min, int max){
		
		if (max<min){
			return -1;
		}
		
		int ran= min + max /2;
		
		if (ran*ran==a){
			return ran;
		}
		else
		if (ran*ran > a){
			computeSquareRoot(a,min, ran-1);
		}
		else {
			if (ran*ran <a){
				computeSquareRoot (a,ran+1, max);
			}
		}
		return -1;
	}

}
