package arraysAndStrings.stringrotation;

public class StringRotation {
	
	public boolean isStringRotation (String s1, String s2)
	{
		//brute force
	   //wat-erbottle rotating gives erbottle-wat
		
		int u=0;
		
		for (int i=0;i<s1.length();i++){
			if (s2.charAt(u)==s1.charAt(i)){
				int x=i++;
				u=u++;
				
				while (s2.charAt(u) == s1.charAt(x) && x<s1.length() && u<s2.length()){
					x++;
					u++;
				}
				
				if (x==s1.length()-1 && u!=s2.length()){
					int z=i;
					while (u+z+1<s2.length()){
						
					}
				}
			}
		}
		return false;
	}	
	public boolean isSubString(String s1, String s2){
		
		return true;
	}

}
