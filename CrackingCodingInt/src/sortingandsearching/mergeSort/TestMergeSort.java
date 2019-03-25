package sortingandsearching.mergeSort;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestMergeSort extends TestCase {

    @Test
    public void testMergeSort(){

        MyMergeSort mj = new MyMergeSort();
        Integer[] input= new Integer[]{8,6,12,15,1,17,9};

        mj.sortArray(input);

        for(int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }

    }
}
