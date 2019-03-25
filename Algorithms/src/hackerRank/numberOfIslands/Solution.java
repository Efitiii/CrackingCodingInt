package hackerRank.numberOfIslands;



class Solution {
public int numIslands(char[][] grid) {
        int count=0;
        for (int r=0;r<grid.length;r++){
        for (int c=0; c<grid[0].length;c++){
        if (grid[r][c]=='1'){
        count++;
        countIslands(r,c,grid);
        }
        }
        }

        return count;

        }


private void countIslands(int r, int c, char[][] grid){

        if (r>=grid.length || c>=grid[0].length || r<0 || c<0 || grid[r][c]=='0'){
        return;
        }

        grid[r][c]='0';

        countIslands(r+1,c,grid);

        countIslands(r-1,c,grid);

        countIslands(r,c-1,grid);

        countIslands(r,c+1,grid);

        }
        }