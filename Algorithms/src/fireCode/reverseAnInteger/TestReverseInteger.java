package fireCode.reverseAnInteger;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestReverseInteger extends TestCase {

    @Test
    public void testReverseInt(){

        int output= ReverseInteger.reverseInt2(-321);
        assertEquals(-123,output);
    }
}
