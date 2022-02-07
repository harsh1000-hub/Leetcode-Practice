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
    private static int length(ListNode head){
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null || head==null) {
            return null;
        }
        int len=length(head);
        int count=len-n;
        ListNode temp=head;
        if(count==0){
            temp=head;
            head=head.next;
            return head;
        }
        int pos=0;
        while(pos<count-1 && temp!=null){
            temp=temp.next;
                pos++;
        }
        temp.next=temp.next.next;
        return head;
    }
}