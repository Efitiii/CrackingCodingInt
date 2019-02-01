package tests;



import implementation.BinarySearchTree;
import junit.framework.TestCase;
import org.testng.annotations.Test;

public class BinarySearchTreeTest extends TestCase{

	@Test
	public void binarySearchTreeTester() {
		BinarySearchTree binarySearchTree= new BinarySearchTree();
		int[] arr= new int[]{1,2,3,4,5,7,8};
		assertEquals(binarySearchTree.binarySearch(7, arr), 6);
	}

}
