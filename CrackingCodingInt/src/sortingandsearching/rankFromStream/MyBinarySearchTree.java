package sortingandsearching.rankFromStream;

public class MyBinarySearchTree {

    Node root;
    Integer size;

    MyBinarySearchTree(){

        root= new Node(null, null, null, 0);
        size=0;
    }


//    public track(int x){
//
//
//    }

    public int getRankOfNumber(int x){

       return  findNumberOfValuesLessThan(root,x,0);
    }

    private int findNumberOfValuesLessThan(Node current, int x, int count){


        if (current.val==x){

            return preOrderTraversal(current.left, count);

        }

        if (current.val>x){

            findNumberOfValuesLessThan(current.left,x,count);

        }
        else {

            if (current.val<x){
                count= count+ preOrderTraversal(current.left,count)+1;
                return findNumberOfValuesLessThan(current.right,x,count);

            }
        }

      return count;

    }

    private int preOrderTraversal(Node current, Integer count){

        if (current==null)
            return count;

        count = visited(current, count);
        count = preOrderTraversal(current.left,count);
        count = preOrderTraversal(current.right, count);

        return count;

    }


    private int visited(Node current, Integer count){

        return count+current.getNumberOfNodesLeft();

    }



    public void insertValue(Integer in){

        if (root.val==null){

            root= new Node(in, null, null, 0);
            size++;
        }

        else insertByTraversing(root,in);

    }


    private void insertByTraversing(Node current, Integer in){

        if (current.val>=in){

            if (current.left==null){
                current.left=new Node(in,null,null, 0);
                current.numberOfNodesLeft++;
                size++;
                return;
            }
            else insertByTraversing(current.left,in);
        }

        else if (current.val<in){

            if (current.right==null){
                current.right=new Node(in,null,null, 0);
                size++;
            }
            else insertByTraversing(current.right,in);
        }


    }
}
