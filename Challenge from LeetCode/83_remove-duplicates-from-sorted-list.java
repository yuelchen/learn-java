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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode previous = head;
        ListNode current = head;
        
        while(current != null && current.next != null) {
            current = current.next;
            if(previous.val == current.val) {
                previous.next = current.next;
            } else {
                previous = current;
            }
        }
        
        return head;
    }
}
