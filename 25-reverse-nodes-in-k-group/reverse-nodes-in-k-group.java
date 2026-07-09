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
    
        public ListNode getKthNode(ListNode temp , int k ){
            k--;
            while(temp!=null && k!=0){
                temp = temp.next;
                k--;
                            }
        
        return temp;
        }

        
    

    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevLast = null;

        while(temp!=null){
            ListNode kthNode = getKthNode(temp,k);
            if(kthNode == null){
                if(prevLast!=null){
                    prevLast.next = temp;
                }
                break;
            }
            // Save the next group's head
            ListNode nextNode = kthNode.next;
             // Disconnect current group
            kthNode.next = null;
            // Reverse current group
            reverseLinkedList(temp);
            // Connect previous group to reversed group
            if (temp == head) {
                head = kthNode;
            }else{
                prevLast.next = kthNode;
            }
             // temp becomes the last node after reversing
            prevLast = temp;
            // move to next group
            temp = nextNode;






        }

        return head;

}
}