package leetCode.letterCombinationsOfaPhoneNumber;

import junit.framework.TestCase;

public class TestSolutions extends TestCase {

    public void testSolutions(){
        Solution solution= new Solution();
        solution.letterCombinations("43").forEach(s->{
            System.out.println(s);
        });


    }
}
