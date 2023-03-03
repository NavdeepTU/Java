// 1. Swap nodes in Pairs
// https://leetcode.com/problems/swap-nodes-in-pairs/
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode rightNode = swapPairs(head.next.next);
        ListNode next = head.next;
        head.next.next = head;
        head.next = rightNode;
        return next;
    }
}