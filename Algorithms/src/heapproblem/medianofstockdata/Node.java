package heapproblem.medianofstockdata;

import java.util.ArrayList;
import java.util.List;

public class Node {

    Node left;
    Node right;
    Integer val;

    Node(Integer val, Node left, Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

    public static void main(String[] args){
        List<Integer> input= new ArrayList<Integer>();
        System.out.println(input.get(0));
    }

}
