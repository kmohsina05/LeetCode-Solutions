/*
LEETCODE 21

21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked lists.

Question Image : https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

*/


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode result = new ListNode();
        ListNode prev = result;
        
        ListNode t1 = list1;
        ListNode t2 = list2;
       
        while(t1!=null && t2!=null)
        {
            if(t1.val <= t2.val)
            {
                prev.next = t1;
                t1=t1.next;
            }
            else{
                prev.next = t2;
                t2 = t2.next;
            }
            prev = prev.next;
        }
        
        prev.next =  (t1!=null) ? t1 : t2; 
        return result.next;
        
        
    }
}
