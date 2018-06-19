package facebook.findanagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//input ["eat", "tea", "tan", "ate", "nat", "bat"]
//output [
//  ["ate", "eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]


public class FindAnagram {
	
	public List<String[]>  findAnagramPairs(String[] input){
		List<String[]> output=new ArrayList<String[]>();
		Integer temp=0;
		Integer difference=0;
		String inAction="";
		Integer numericA= Character.getNumericValue('a');
		Map<Integer,LinkedList<String>> pairsMap= new HashMap<Integer, LinkedList<String>>();
		//Map<Integer,String> pairsMap= new HashMap<Integer,String>();
		
		
		for (int i=0;i<input.length;i++){
            temp=0;
			inAction=input[i];
		for (int u=0;u<input[i].length();u++){
			difference= Character.getNumericValue(inAction.charAt(u))-numericA;
			temp |= (1<<difference);
		}
		
		//pairsMap.put(temp, input[i]);
		//pairsMap.get(temp).add(input[i]);
		
		if (pairsMap.containsKey(temp)){
			//pairsMap.get(temp).add(input[i]);
			pairsMap.get(temp).add(input[i]);
			//pairsMap.put(temp, input[i]);
		}
		else {
			LinkedList<String> pairsLink= new LinkedList<String>();
			pairsLink.add(input[i]);
			pairsMap.put(temp,pairsLink);
		}
		
		}
		
		
		for (LinkedList<String> values: pairsMap.values()){
			//System.out.println(pairsMap.get(keyVal));
			int z=0;
			String[] strArray= new String[values.size()];
		if (values.size()>1)	{
		for (int i=0;i<values.size();i++){
		    strArray[i]=values.get(i);
			System.out.println(values.get(i));
			
			}
		}
		
		output.add(strArray);
		}
		
		
		return output;
		
	}

}
