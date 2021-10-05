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
    public ListNode removeElements(ListNode head, int val) {
        head = getFirstNode(head, val);
        
        if(head != null){
            ListNode p1 = head;
            ListNode p2 = head.next;

            while(p2 != null) {
                if(p2.val == val) {
                    p1.next = p2.next;
                    p2 = p2.next;
                } else {
                    p1 = p1.next;
                    p2 = p2.next;
                }
            }
        }
        
        return head;
    }
    
    private ListNode getFirstNode(ListNode head, int val) {

        if(head == null) {
            return null;
        } else if(head.val == val) {
            return getFirstNode(head.next, val);
        }
        
        return head;
    }
}
