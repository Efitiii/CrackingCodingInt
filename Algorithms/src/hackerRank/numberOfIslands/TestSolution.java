package hackerRank.numberOfIslands;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestSolution extends TestCase {

    @Test
    public void testSolution(){
        Solution sol= new Solution();
        char[][] grid= new char[][]{{'1','1', '1','1', '0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        System.out.println(sol.numIslands(grid));

    }
}
