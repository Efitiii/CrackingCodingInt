package treesAndGraphs.PathsWithSum;

import java.util.HashMap;
import java.util.Map;

public class PathsWithSum {
	
	Integer count;
	
	public PathsWithSum(){
		this.count=0;
		
	}
	
	public Integer countPossiblePathsToASum(MyBinaryTree tree, Integer value){
		
		countSumOfValue(tree.getRoot(), value);
		
		
		return getCount();
		
	}
	
	
	public Node countSumOfValue(Node root, Integer value){
		
		if (root.getLeft()==null &&  root.getRight()==null){
			return root;
		}
		
		if (root.getLeft()!=null){
			
			Node leftNode=root.getLeft();
			Integer sum=leftNode.getVal()+root.getVal();
			Node newLeft=new Node(leftNode.getLeft(),leftNode.getRight(),sum);
			
			if (sum==value){
				this.count++;	
			}
			
			countSumOfValue(newLeft,value);
			countSumOfValue(root.getLeft(),value);
		}
		
	if (root.getRight()!=null){
			
			Node rightNode=root.getRight();
			Integer sum=rightNode.getVal()+root.getVal();
			Node newRight=new Node(rightNode.getLeft(),rightNode.getRight(),sum);
			
			if (sum==value){
				this.count++;
			}
			countSumOfValue(newRight,value);
			countSumOfValue(root.getRight(),value);	
		}
	
	return root;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	public Integer pathsWithSumOptimized(MyBinaryTree myTree, Integer targetSum){
		
		Node root = myTree.getRoot();
		
		Map<Integer, Integer> mapValues= new HashMap<>();
		mapValues.put(0, 1);
		Integer runningSum=0;
		
		Integer totalCount = checkForSum(root, mapValues, runningSum, targetSum);
		//Integer countRight = checkForSum(root.getRight());
		
		
		
		return totalCount;
		
	}
	
	
	private Integer checkForSum(Node currentNode, Map<Integer, Integer> mapValues, Integer runningSum, Integer targetSum){
		
		if (currentNode.getLeft()==null && currentNode.getRight()==null){
			return this.count;
		}
		
		if (currentNode.getRight()!=null){
			Map<Integer, Integer> rightMap= mapValues;
			runningSum= currentNode.getVal()+currentNode.getRight().getVal();
			Integer requiredSum=runningSum-targetSum;
			
			if (rightMap.containsKey(requiredSum)){
				this.count+=rightMap.get(requiredSum);
			}
			
			if (rightMap.containsKey(runningSum)){
				Integer currentCount= rightMap.get(runningSum);
				rightMap.put(runningSum, currentCount);
			}
			else rightMap.put(runningSum, 1);
			
			checkForSum(currentNode.getRight(),rightMap,runningSum, targetSum);
			
		}
		
		
		
		
		if (currentNode.getLeft()!=null){
			
			runningSum=currentNode.getVal()+currentNode.getLeft().getVal();
			Integer requiredSum=runningSum-targetSum;
			
			if (mapValues.containsKey(requiredSum)){
				this.count+=mapValues.get(requiredSum);
			}
			
			if (mapValues.containsKey(runningSum)){
				Integer curCount=mapValues.get(runningSum);
				mapValues.put(runningSum, curCount+1);
			}
			else mapValues.put(runningSum, 1);
			
			checkForSum(currentNode.getLeft(), mapValues, runningSum, targetSum);
		}
		
		
		
		
		return getCount();
	}
	
	
	
}


//          4                                 3 0 -1 -4
//     -1       -4
//  2     4   1    3
//1  3  -1  2

//   -1         3
//2       4  2      4



//3    5   3   6  2  4    




