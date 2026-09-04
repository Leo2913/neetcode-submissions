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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr1 = head;
        int size = 0;
        while(curr1 != null){
            size++;
            curr1 = curr1.next;
        }
        int index = size - n;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr2 = head;
        while(curr2 != null){
            if(index == 0){
                prev.next = curr2.next;
                curr2.next = null;
                break;
            }
            prev = curr2;
            curr2 = curr2.next;
            index--;
        }
        return dummy.next;
    }
}
