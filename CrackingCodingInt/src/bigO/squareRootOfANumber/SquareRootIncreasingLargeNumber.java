package bigO.squareRootOfANumber;

public class SquareRootIncreasingLargeNumber {
	
	public int computeSquareRoot(int a){
		
		for (int guess=1;guess*guess<=a;guess++){
			if (guess*guess==a){
				return guess;
			}
		}
		return -1;
	}

}

// O(sqrt(a))
