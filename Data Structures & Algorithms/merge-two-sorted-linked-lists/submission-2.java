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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode curr = dummy;
        dummy.next = curr;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val > l2.val){
                    curr.next = l2;
                    curr = curr.next;
                    l2 = l2.next;
                }else{
                    curr.next = l1;
                    curr = curr.next;
                    l1 = l1.next;
                }
            }else if(l1 != null){
                curr.next = l1;
                break;
            }else{
                curr.next = l2;
                break;
            }
        }
        return dummy.next;
    }
}