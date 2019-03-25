package treeTraversal.InPrePost;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestMyTree extends TestCase

{

    @Test
    public void testTraversalOfTree(){

      MyTree tree= new MyTree();

        tree.addToTree(5);
        tree.addToTree(4);
        tree.addToTree(3);
        tree.addToTree(2);
        tree.addToTree(1);
        tree.addToTree(7);
        tree.addToTree(8);

        System.out.println("Printing INOrder");
        tree.inOrderTraversal(tree.root);

        System.out.println("Printing PreOrder");
        tree.preOrderTraversal(tree.root);


        System.out.println("Printing Post Order");
        tree.postOrderTraversal(tree.root);

    }
}
