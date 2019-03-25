package treeTraversal.InPrePost;

import java.util.LinkedList;
import java.util.Queue;


// This algorithm incorporates the different ways of traversing in a tree and also compares two trees to find out if one is a sub-tree of the other

public class MyTree {

    Node root;
    StringBuilder str;

    MyTree() {
        this.root = new Node(null, null, null);
        this.str= new StringBuilder();
    }


    public void addToTree(Integer in) {

        if (this.root.val == null) {
            this.root = new Node(in, null, null);
        } else {

            Queue<Node> que = new LinkedList<>();

            que.add(this.root);

            iterateAndAdd(in, que);
        }


    }

    public void iterateAndAdd(Integer in, Queue<Node> que) {

        boolean inserted = false;
        while (!que.isEmpty() && inserted == false) {
            Node current = que.poll();
            if (current.getLeft() == null) {
                current.left = new Node(in, null, null);
                inserted = true;
            } else if (current.getRight() == null) {
                current.right = new Node(in, null, null);
                inserted = true;
            }
            que.add(current.left);
            que.add(current.right);

        }

    }


    public void inOrderTraversal(Node current) {

        if (current == null) {

            return;
        }

        inOrderTraversal(current.left);
        printVisitedNode(current);
        inOrderTraversal(current.right);

    }


    public void preOrderTraversal(Node current) {

        if (current == null)
            return;

        printVisitedNode(current);
        preOrderTraversal(current.left);
        preOrderTraversal(current.right);

    }

    public void postOrderTraversal(Node current) {

        if (current == null) {
            return;
        }

        postOrderTraversal(current.left);
        postOrderTraversal(current.right);
        printVisitedNode(current);


    }

    private void printVisitedNode(Node current) {
        System.out.println(current.getVal());
    }


    public boolean compareTrees(MyTree t1, MyTree t2){
        StringBuilder smallStr= new StringBuilder();
        StringBuilder largeStr= new StringBuilder();
        int i=0;
        boolean found=false;

        String bigTreeString= preOrderTraversalPrintString(t1.root, largeStr).toString();
        String smallTreeString= preOrderTraversalPrintString(t2.root, smallStr).toString();

        while (i<bigTreeString.length() && found==false){
            if (bigTreeString.charAt(i)==smallTreeString.charAt(0)){
                String subString= bigTreeString.substring(i-1,i-1+smallTreeString.length());
                if (subString.equals(smallTreeString)){
                    found=true;
                }

            }
        }

        return found;
    }


    private StringBuilder preOrderTraversalPrintString(Node current, StringBuilder str){

        if (current==null)
            return str.append(" ");

        str.append(current.getVal());
        preOrderTraversalPrintString(current.left, str);
        preOrderTraversalPrintString(current.right,str);

        return str;
    }





    //Less Efficient
    public boolean compareTrees(Node big1, Node small) {

        boolean found = false;

        if (big1 == null)
            return false;

        if (big1.val == small.val) {
            found = preOrderTraversalTrees(big1, small);
        }

        if (found == false) {
            found = compareTrees(big1.left, small);
        }

        if (found == false) {
            found = compareTrees(big1.right, small);
        }

        return found;

    }


    private boolean preOrderTraversalTrees(Node big1, Node small){

        if (big1==null && small!=null || big1!=null && small==null)
            return false;

        if (big1.val!=small.val)
            return false;

        if (big1==null && small==null)
            return true;

       boolean leftTree= preOrderTraversalTrees(big1.left, small.left);
       boolean rightTree= preOrderTraversalTrees(big1.right, small.right);

      if (leftTree==false || rightTree==false)
          return false;

       return true;

    }


}
