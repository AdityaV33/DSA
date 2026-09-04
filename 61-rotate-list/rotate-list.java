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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null|| head.next == null || k ==0){
                return head;
        }
        int n= 1;

        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            n++;
        }
        k=k%n;
        if(k==0) return head;
        //new tail find 
        ListNode newTail = head;
        int steps = n-k-1;
        for(int i =0;i<steps;i++){
             newTail = newTail.next;

        }
        //new head 
        ListNode newHead = newTail.next;
        //disconnecting the list 
        newTail.next = null;
        //connect old tail to old head;
        tail.next=head;
        return newHead;
       
    }
}