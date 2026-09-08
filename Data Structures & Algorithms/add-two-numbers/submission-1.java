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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)    return l1;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int remain = 0;
        while(l1 != null || l2 != null){
            int val;
            if(l1 != null && l2 != null){
                val = l1.val + l2.val + remain;;
                remain = val / 10;
                node.next = new ListNode(val % 10);
                l1 = l1.next;
                l2 = l2.next;
                node = node.next;
            }else if(l1 != null){
                val = l1.val + remain;
                remain = val / 10;
                node.next = new ListNode(val % 10);;
                l1 = l1.next;
                node = node.next;
            }else{
                val = l2.val + remain;
                remain = val / 10;
                node.next = new ListNode(val % 10);;
                l2 = l2.next;
                node = node.next;
            }
        }
        if(remain != 0){
            node.next = new ListNode(remain);
        }
        return dummy.next;
    }
}
