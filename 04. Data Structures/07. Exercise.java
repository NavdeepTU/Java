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

// 2. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        int temp = n;
        ListNode slow = head, fast = head;
        while(temp != 0) {
            fast = fast.next;
            temp--;
        }
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(fast == null) { // removing first node
            head = head.next;
        }else if(n == 1) { // removing last node
            slow.next = null;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }
}

// 3. Reverse Linked List II
// https://leetcode.com/problems/reverse-linked-list-ii/

class Solution {

    public ListNode reverse(ListNode head) {
        ListNode curr, prev = null;
        while(head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNode = head, leftPrevNode = head, rightNode = head, rightNextNode = head;
        left = left-1;
        while(left != 0) {
            leftPrevNode = leftNode;
            leftNode = leftNode.next;
            left--;
        }
        while(right != 0) {
            rightNode = rightNextNode;
            rightNextNode = rightNextNode.next;
            right--;
        }
        rightNode.next = null;
        ListNode reversedHead = reverse(leftNode);
        if(leftPrevNode == leftNode) {
            head = reversedHead;
        } else {
            leftPrevNode.next = reversedHead;
        }
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = rightNextNode;
        return head;
    }
}