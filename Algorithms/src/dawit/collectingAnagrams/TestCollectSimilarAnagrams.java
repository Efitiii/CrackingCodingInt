package dawit.collectingAnagrams;

import junit.framework.TestCase;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCollectSimilarAnagrams extends TestCase {

    @Test
    public void testSimilarAnagrams(){
        CollectSimilarAnagrams collect= new CollectSimilarAnagrams();

        List<String> input= new ArrayList<>();
        input.add("cat");
        input.add("atc");
        input.add("boy");
        input.add("dog");
        input.add("tac");
        input.add("yob");
        input.add("god");
        input.add("ybo");

        collect.returnSpecificAnagrams(input,"yob").forEach(in->System.out.println(in));


    }


}
