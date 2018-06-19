
public class ReverseArray {
	
	static String[] arrReversed;
	static String[] arrToBeReversed;

	public static void main(String[] args) {
		arrToBeReversed= new String[]{"H","e", "r", "l","o"};
     arrReversed= reverseArray(arrToBeReversed);
     
     for (int i=0;i<arrReversed.length;i++){
    	 System.out.println(arrReversed[i]);
     }
	}
	
	public static String[] reverseArray(String[] arrToBeReversed){
		int halfLength=(arrToBeReversed.length)/2;
		int arraySize= arrToBeReversed.length;
		String temp = null;
		if(arrToBeReversed!=null){
		for (int i=0;i<halfLength;i++){
			temp=arrToBeReversed[i];
			arrToBeReversed[i]=arrToBeReversed[arraySize-i-1];
			arrToBeReversed[arraySize-i-1]=temp;
		}
		}
		return arrToBeReversed;
	}

}
