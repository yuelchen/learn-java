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
    
    public boolean isPalindrome(ListNode head) {
        // if head node is null, then return true
        if(head == null || head.next == null) {
            return true;
        } 
        
        // retrieve the middle node and last node
        ListNode middle = head; 
        ListNode last = head;
        while(last.next != null && last.next.next != null) {
            last = last.next.next;
            middle = middle.next;
        }
        
        // in event count is even, then we need to move last node over by 1
        if(last.next != null) {
            last = last.next;
        }
        
        // reverse everything between middle.next and last; where last becomes second head
        ListNode secondCurrent = middle.next;
        middle.next = null;
        
        ListNode previous = null;
        while(secondCurrent != last) {
            ListNode tempNext = secondCurrent.next;
            secondCurrent.next = previous;
            previous = secondCurrent;
            secondCurrent = tempNext;
        }
        last.next = previous;
        
        //now compare starting head and second head
        while(last != null) {
            if(head.val == last.val) {
                head = head.next;
                last = last.next;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
