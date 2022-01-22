/*

LEETCODE 1137 

The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537

Constraints:

0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.

*/
class Solution {    
     public int tribonacciM(int n, int[] dp )
    {
        if(n<=2){
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
        }
        
        if(dp[n]!=-1)
            return dp[n];
        else{
            if(n-1>=0)
                dp[n-1] = tribonacciM(n-1 , dp);
            if(n-2 >= 0)
                dp[n-2] = tribonacciM(n-2, dp);
            if(n-3 >=0 )
                dp[n-3] = tribonacciM(n-3, dp);

            dp[n] = dp[n-1] + dp[n-2] + dp[n-3];
            return dp[n];
        }
     }
  
    public int tribonacci(int n)
    {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int[] dp = new int[n+1];
        for(int i = 0; i<=n ;i++)
            dp[i] =-1;
        
        int ans = tribonacciM(n, dp);
        return ans;
            
    }
}


