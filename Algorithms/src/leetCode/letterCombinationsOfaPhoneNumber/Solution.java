package leetCode.letterCombinationsOfaPhoneNumber;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {

        String[] input= new String[]{"","","abc","def","ghi"};
        List<String> output= new ArrayList<>();
        return constructLetters(output,input, digits, 0, "");

    }


    private List<String>  constructLetters(List<String> output, String[] input, String digits, Integer offset, String prefix){

        if (offset>=2){
            output.add(prefix);
            return output;
        }

        String letters= input[digits.charAt(offset)-'0'];

        for (int i=0; i<letters.length();i++){
            constructLetters(output,input,digits,offset+1,prefix+letters.charAt(i));
        }

        return output;

    }
}
