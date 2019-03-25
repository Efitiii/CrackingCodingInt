package heapproblem.medianofstockdata;

import java.util.ArrayList;
import java.util.List;

public class MyHeap {

   public List<Integer> myHeap;

   MyHeap(){
       myHeap= new ArrayList<>();
   }

   public void heapify(Integer input){

       if (myHeap.isEmpty()){
           myHeap.add(input);
       }
       else
       {
           findVacantNode(input, 0, myHeap);

       }


   }

   public void findVacantNode(Integer input, Integer index, List<Integer> myHeap){


   }


}
