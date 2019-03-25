package dawit.collectingAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectSimilarAnagrams {


    public List<String>  returnSpecificAnagrams(List<String> anagrams, String input){

        Map<Integer, List<String>> output= collectAnagrams(anagrams);
        Integer holder=0;
        Integer num_a= Character.getNumericValue('a');


        for (int i=0; i<input.length();i++){
            Integer num_curr= Character.getNumericValue(input.charAt(i));

            holder= holder | (1<< (num_curr-num_a+1));
        }

        if (!output.containsKey(holder)){
            return null;
        }

        return output.get(holder);

    }


    public  Map<Integer, List<String>>  collectAnagrams(List<String> anagrams){

        Map<Integer, List<String>> output= new HashMap<Integer, List<String>>();
        Integer numericValue_a=Character.getNumericValue('a');

        anagrams.forEach(in->{

            Integer holder=0;

            for (int i=0;i<in.length();i++){
                Integer currentCharacter=Character.getNumericValue(in.charAt(i));
                Integer insertedChar= currentCharacter-numericValue_a+1;

                holder= holder | (1<<insertedChar);
            }

            if (output.containsKey(holder)){
                List<String> currentList= output.get(holder);
                currentList.add(in);
            }
            else {
                List<String> newInput= new ArrayList<>();
                newInput.add(in);
                output.put(holder,newInput);
            }



        });


        return output;
    }

}
