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
    public ListNode reverseList(ListNode head) {
        ListNode dummy_Node=null;
        while(head!=null){
            ListNode next=head.next;  // store the address of the next node of head
            head.next=dummy_Node; // assign head.next=null in first iteration and here we break the link b/w head and head.next
            dummy_Node=head;  // assign dummy_Node to head
            head=next;  // move head for further steps using Line 15 next bcz next maintain the address of head.next 
        }
        return dummy_Node;
    }
}
// Input : head->1->2->3->4->5->null
// changing the links in Line 25
// Output: null<-1<-2<-3<-4<-5<-head