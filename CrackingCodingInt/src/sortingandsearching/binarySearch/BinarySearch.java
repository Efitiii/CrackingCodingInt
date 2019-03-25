package sortingandsearching.binarySearch;

public class BinarySearch {



    public int searchForItem(Integer[] input, Integer item){

      int high= input.length-1;
      int low=0;

      int output= searchArray(input, item, low, high);

      return output;



    }


    private int searchArray(Integer[] input, Integer item, int low, int high){

        if (low>high)
            return -1;
        int mid= (low+high)/2;

        if (input[mid]==item){
            return mid;
        }

        if (input[mid]>item){
          return    searchArray(input,item,low,mid-1);
        }

          return   searchArray(input, item, mid+1,high);

    }




}
