package sortingandsearching.rankFromStream;

public class Node {

    Integer val;
    Node left;
    Node right;
    Integer numberOfNodesLeft;

    Node(Integer val, Node left, Node right, Integer numberOfNodesLeft){
        this.val=val;
        this.left=left;
        this.right=right;
        this.numberOfNodesLeft=numberOfNodesLeft;

    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Integer getNumberOfNodesLeft() {
        return numberOfNodesLeft;
    }

    public void setNumberOfNodesLeft(Integer numberOfNodesLeft) {
        this.numberOfNodesLeft = numberOfNodesLeft;
    }
}
