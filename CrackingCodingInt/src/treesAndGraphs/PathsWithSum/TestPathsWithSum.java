package treesAndGraphs.PathsWithSum;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestPathsWithSum  extends TestCase{
	
	
@Test
public void testpathWithSum(){
	MyBinaryTree myTree= new MyBinaryTree(4);
	myTree.addValueToTree(3);
	myTree.addValueToTree(2);
	myTree.addValueToTree(4);
	myTree.addValueToTree(5);
	myTree.addValueToTree(3);
	myTree.addValueToTree(8);
	
	System.out.println(myTree.toString());
	
	PathsWithSum testSum= new PathsWithSum();
	//assertTrue(testSum.countPossiblePathsToASum(myTree, 7)==3);
	assertTrue(testSum.pathsWithSumOptimized(myTree, 7)==3);
	
}

}
