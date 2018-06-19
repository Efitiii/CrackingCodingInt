package arraysAndStrings.permutationString;

public class PermutationString {
	Boolean isPermutation;
	
	public Boolean isPermutation(String input, String original){
		isPermutation=true;
		
		String sorted=sortString(original);
		
		for (int i=0;i<input.length();i++){
			if (findInSortedString(input.charAt(i),sorted)==false){
				isPermutation=false;
			}
		}
		
		return isPermutation;
		
	}
	
	public boolean findInSortedString(char i,String sorted){
		//abcdefg c
		if (sorted.length()==1){
			if (sorted.charAt(i)==i){
				return true;
			}
			else return false;
		}
		
		int mid=sorted.length()/2;
		
		if (sorted.length()==1 && sorted.charAt(mid)==i){
			return true;
		}
		else
			if (sorted.length()==1 && sorted.charAt(mid)!=i){
				return false;
			}
			else
		if (sorted.charAt(mid)>i){
			return findInSortedString(i,sorted.substring(0, mid-1));
		}
		else if(sorted.charAt(mid)<i){
			return findInSortedString(i,sorted.substring(mid, sorted.length()));
		}
		
		return false;
	}
	
	public String sortString(String toBeSorted){
		
		//("ahcb").equals("abch")
		
		if (toBeSorted.length()==1){
			return toBeSorted;
		}
		
		if (toBeSorted.length()==2){
			if (toBeSorted.charAt(0)>toBeSorted.charAt(1)){
				StringBuilder s= new StringBuilder();
				s.append(toBeSorted.charAt(1));
				s.append(toBeSorted.charAt(0));
				return s.toString();
			}
			
			else return toBeSorted;
		}
		
	
		
		String pre=sortString(toBeSorted.substring(0, toBeSorted.length()/2));  ///gh
		String suf=sortString(toBeSorted.substring(toBeSorted.length()/2, toBeSorted.length())); //bc
		StringBuilder sorted= new StringBuilder();
		int traverPre=0;
		int traverSuf=0;
		boolean inserted=false;
		// efg  a bc  abc  acdef
		char checker= pre.charAt(0);
		while (traverSuf<suf.length() && traverPre<pre.length())
		{
			 
			if (checker>suf.charAt(traverSuf)){
				sorted.append(suf.charAt(traverSuf)); //abc
				traverSuf++;
			}
			else {
			if (traverPre<pre.length()-1){
			sorted.append(checker); //a
			checker = pre.charAt(traverPre+1); //h
			traverPre++; //1
			}
			
			else if (traverPre==pre.length()-1){
				sorted.append(checker);
				traverPre++;
			}
			
			}
		}
		
		if (traverPre<pre.length()){
			sorted.append(pre.substring(traverPre, pre.length())); //bcgh
		}
		else if (traverSuf<suf.length()){
			sorted.append(suf.substring(traverSuf, suf.length()));
		}
		
		
		
		return sorted.toString();
		
	}
	

}
