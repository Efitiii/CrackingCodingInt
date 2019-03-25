package dawitAlgorithm.targetSumOffour;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestDaysOfWeek extends TestCase {

    @Test
    public void testDaysOfWeek(){
      DaysOfWeek n= new DaysOfWeek();
        System.out.println(n.solution("Wed", 2));
        System.out.println(n.solution("Wed", 23));
        assertTrue(n.solution("Wed", 2).equals("Fri"));
    }
}
