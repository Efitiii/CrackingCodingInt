
public class PrimeTest {

	public static void main(String[] args) {
		System.out.println(isPrime(15));

	}
	
	public static boolean isPrime(int num){
		if (num<2) return false;
		
		for( int x=2; x*x<=num; x++)
		{
			if (num % x == 0) return false;
		}
		return true;
	}

}
