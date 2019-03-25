package mumexam.awettesfamariam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EquivalentArray {
	
	public EquivalentArray(){
		
	}
	
	public int equivalentArray(int[] array1, int[] array2){
		
		
		Map<Integer, Integer> mappedArr1= new HashMap<Integer, Integer>();
		Map<Integer, Integer> mappedArr2= new HashMap<Integer, Integer>();
		boolean contains=true;
		
		if (array1.length==0 && array2.length==0){
			return 1;
		}
		
		if (array1.length==0 || array2.length==0){
			return 0;
		}
		
	    for (int i=0; i<array1.length;i++){
	    	mappedArr1.put(array1[i], array1[0]);
	    }
	    
	    for (int u=0; u<array2.length;u++){
	    	mappedArr2.put(array2[u], array2[u]);
	    }
	    
	    Iterator<Entry<Integer, Integer>> it1= mappedArr1.entrySet().iterator();
	    Iterator<Entry<Integer, Integer>> it2= mappedArr2.entrySet().iterator();
		  
	    while(it1.hasNext() && contains==true ){
	    	
	    	Map.Entry<Integer, Integer> pair= (Map.Entry<Integer, Integer>)it1.next();
	    	
	    	if (!mappedArr2.containsKey(pair.getKey())){
	    		contains=false;
	    	}
	    	
	    }
	    
        while(it2.hasNext() && contains==true){
	    	
	    	Map.Entry<Integer, Integer> pair2= (Map.Entry<Integer, Integer>)it2.next();
	    	
	    	if (!mappedArr1.containsKey(pair2.getKey())){
	    		contains=false;
	    	}
	    	
	    }
        
        if (contains==false){
        	return 0;
        }
	    
	    
		
		
		return 1;
	}

}
