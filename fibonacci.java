/*

LEETCODE Q. 509
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

*/

class Solution {
    public static int fiboM(int n, int[] dp)
    {
        if(n<=1)
            return dp[n] = n;
        if(dp[n]!=-1)
            return dp[n];
        
        int num1 = fiboM(n-1, dp);
        int num2 = fiboM(n-2, dp);
        return dp[n] = num1+num2;
    }
    
    public int fib(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        int ans = fiboM(n, dp);
        return ans;
    }
}
