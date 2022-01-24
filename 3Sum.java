/*
LEETCODE 15

15. 3Sum

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105


*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if(nums.length <3) return new ArrayList<>(res);
        
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length-2; i++)
        {
            if(nums[i]>0) break;
            int  j = i+1;
            int k = nums.length-1;
            
            while(j<k)
            {
                int sum = nums[j]+ nums[k];
                if(sum == -nums[i]){
                    //insert into the set
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum > -nums[i]){
                    k--;
                }
                else if(sum < -nums[i]){
                    j++;
                }
                    
            }
        }
        return new ArrayList<>(res);
    }
}
