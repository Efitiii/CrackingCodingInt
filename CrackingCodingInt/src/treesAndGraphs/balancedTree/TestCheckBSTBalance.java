package treesAndGraphs.balancedTree;

import org.testng.annotations.Test;

import junit.framework.TestCase;


            //8
     //6          10
  //4        5    9     12
//2                         
//1


public class TestCheckBSTBalance extends TestCase{
	
	@Test
	public void checkBSTBalance(){
		CheckBSTBalance balanceChecker= new CheckBSTBalance();
		MyBinaryTree myTree= new MyBinaryTree();
		Node root= myTree.root;
		myTree.add(8);
		myTree.add(10);
		myTree.add(6);
		myTree.add(4);
		myTree.add(5);
		myTree.add(9);
		myTree.add(12);
		myTree.add(2);
		//myTree.add(1);
		
		System.out.println(balanceChecker.checkBalance(myTree));
	}

}
