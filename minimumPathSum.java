/*
LEETCODE 64 
64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example 1:


Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 100

*/

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] dp = new int[n][m];
        
        for(int i = n-1; i>=0; i--)
        {
            for(int j = m-1; j>=0; j--)
            {
                if(i==n-1 && j ==m-1) //last block or destination block
                {
                    dp[i][j] = grid[i][j];
                }
                else if(i==n-1) //last row
                {
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                }
                else if(j==m-1) //last col
                {
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }
                else{ // rest of the matrix
                    int min = Math.min(dp[i+1][j], dp[i][j+1]);
                    dp[i][j] = min + grid[i][j];
                }
                
            }
        }    
        return dp[0][0];      
    }
}
