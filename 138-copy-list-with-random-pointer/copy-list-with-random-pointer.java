/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
        return null;

        Node curr = head;

        //inserting copied nodes after each node
        //original list a->b-> c
        while(curr!=null){
            Node next = curr.next;//value of b
            Node copy = new Node(curr.val); //still a -> b this creates a' or copy of a
        

            curr.next = copy; //a ->x 
            copy.next=next;// a-> x -> b

            curr  = next;  // curr = b
 
    
        }
        
        // deep copy of random pointers 
        curr = head ;
        while(curr != null && curr.next!=null){
            if(curr.random == null){
                curr.next.random = null;
            } else {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // seperating the lists 

        Node newHead = head.next;
        Node  newCurr = newHead;
        curr = head;

        while(curr!=null && newCurr != null){
            curr.next = (curr.next!=null) ? curr.next.next : null;

            newCurr.next = (newCurr.next!=null) ? newCurr.next.next : null;

            curr  = curr.next; // to move to the next 
            newCurr = newCurr.next;
        }

        return newHead;
    }

}