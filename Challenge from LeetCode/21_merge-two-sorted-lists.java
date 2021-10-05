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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if((l1 == null && l2 == null) || (l1 != null && l2 == null)) {
            return l1;
            
        } else if(l1 == null && l2 != null) {
            return l2;
            
        } else {
            
            ListNode pointer1 = l1;
            ListNode pointer2 = l2;
            
            ListNode returnNodeHead;
            if(pointer1.val <= pointer2.val) {
                returnNodeHead = pointer1;
                pointer1 = pointer1.next;
            } else {
                returnNodeHead = pointer2;
                pointer2 = pointer2.next;
            }
            ListNode returnPointer = returnNodeHead;
            
            while(pointer1 != null && pointer2 != null) {
                if(pointer1.val <= pointer2.val) {
                    returnPointer.next = pointer1;
                    pointer1 = pointer1.next;
                } else {
                    returnPointer.next = pointer2;
                    pointer2 = pointer2.next;
                }
                returnPointer = returnPointer.next;
            }
            
            mergeRemaining(returnPointer, pointer1);
            mergeRemaining(returnPointer, pointer2);   
            return returnNodeHead;
        }
    }
    
    private void mergeRemaining(ListNode returnPointer, ListNode sourcePointer) {
        while(sourcePointer != null) {
            returnPointer.next = sourcePointer;
            sourcePointer = sourcePointer.next;
            returnPointer = returnPointer.next;
        }
    }
}
