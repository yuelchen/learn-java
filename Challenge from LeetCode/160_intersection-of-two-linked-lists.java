/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //find the offset and fix the difference by incrementing larger ListNode
        int headADepth = getDepth(headA);
        int headBDepth = getDepth(headB);
        if(headADepth > headBDepth) {
            int offset = headADepth - headBDepth;
            headA = incrementOffset(headA, headADepth - headBDepth); //headA is now same size as headB
        } else if(headADepth < headBDepth) {
            headB = incrementOffset(headB, headBDepth - headADepth); //headB is now same size as headA
        }
        
        //loop through and see if they are the same node
        while(headA != null && headB != null) {
            if(headA != headB) {
                headA = headA.next;
                headB = headB.next;
            } else {
                return headA;
            }
        }
        
        return null;
    }
    
    private ListNode incrementOffset(ListNode node, int offset) {
        do {
            node = node.next;
            offset--;
        } while(offset > 0);
        
        return node;
    }                         
                              
    private int getDepth(ListNode node) {
        int counter = 0;
        while(node != null) {
            counter++;
            node = node.next;
        }
        
        return counter;
    }
}
