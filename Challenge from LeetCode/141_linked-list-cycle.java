/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //HashSet<ListNode> previousNodes = new HashSet<ListNode>();
        boolean looped = false;
        
        //while(head != null && !looped) {
        //    if(!previousNodes.contains(head)) {
        //        previousNodes.add(head);
        //        head = head.next;
        //    } else {
        //        looped = true;
        //    }
        //}
        
        ListNode slow = head;
        ListNode fast = head;
        
        //if looped, fast will eventually loop around and slow will evidentally match fast
        //if not looped, then it will just end while loop and exit with false
        while(fast != null && fast.next != null && !looped) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                //ends while loop
                looped = true;
            }
        }
        
        return looped;
    }
}
