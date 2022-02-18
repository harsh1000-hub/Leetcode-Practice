/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null){
            if(fast.next.next==null){  // condition for when there are one middle node
                slow=slow.next; 
                fast=fast.next;
            }
            else{   // condition for when there are two middle nodes
                slow=slow.next;    
                fast=fast.next.next;
            }
        }
        return slow;
    }
}