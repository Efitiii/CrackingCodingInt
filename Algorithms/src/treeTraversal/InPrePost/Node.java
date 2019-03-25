package treeTraversal.InPrePost;

public class Node {

    Integer val;
    Node left;
    Node right;

    Node(Integer val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Integer getVal() {
        return val;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
