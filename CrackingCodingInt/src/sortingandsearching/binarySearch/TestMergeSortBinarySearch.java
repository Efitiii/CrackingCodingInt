package sortingandsearching.binarySearch;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestMergeSortBinarySearch extends TestCase {

    @Test
    public void testMergeSort(){

        MyMergeSort mj = new MyMergeSort();
        Integer[] input= new Integer[]{8,6,12,15,1,17,9};

        mj.sortArray(input);

        BinarySearch bin= new BinarySearch();
       int x= bin.searchForItem(input, 12);

        System.out.println("Index of number to be searched :"+x);

        for(int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }

    }
}
