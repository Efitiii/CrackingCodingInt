package geeksforgeeks.treeSet;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args){
        TreeSet<String> ts= new TreeSet<String>();

        Queue<Integer> que= new PriorityQueue<>();

        ts.add("Z");
        ts.add("A");
        ts.add("U");

        que.add(202);
        que.add(102);
        que.add(503);
        que.add(33);

        System.out.println(ts);
        System.out.println("Iterating in PriorityQueue");

        Iterator itr= que.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Polling PriorityQueue in Java");

        while(!que.isEmpty()){
            System.out.println(que.poll());
        }
    }
}
