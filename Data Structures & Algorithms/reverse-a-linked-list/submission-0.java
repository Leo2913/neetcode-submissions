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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode curr1 = null;
        ListNode curr2 = head;
        while(curr2 != null){
            ListNode temp = curr2.next;
            curr2.next = curr1;
            curr1 = curr2;
            curr2 = temp;
        }
        return curr1;
    }
}
