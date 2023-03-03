// 1. Remove Nth Node From End of List
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

// 2. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
class Solution {
    public ListNode divide(ListNode head) {
        ListNode slow = head, fast = head, slowPrev = head;
        while(fast != null && fast.next != null) {
            slowPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null) {
            slowPrev.next = null;
            return slow;
        } else {
            ListNode slowNext = slow.next;
            slow.next = null;
            return slowNext;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode currNode, prevNode = null;
        while(head != null) {
            currNode = head;
            head = head.next;
            currNode.next = prevNode;
            prevNode = currNode;
        }

        return prevNode;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        boolean isPalindrome = true;
        ListNode head2 = divide(head);
        head2 = reverse(head2);
        ListNode secondHalf = head2;
        ListNode firstHalf = head;
        while(firstHalf != null && secondHalf != null) {
            if(firstHalf.val != secondHalf.val) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        secondHalf = reverse(head2);
        firstHalf = head;
        while(firstHalf.next != null) {
            firstHalf = firstHalf.next;
        }
        firstHalf.next = secondHalf;

        return isPalindrome;
    }
}

// 3. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        boolean hasCycle = false;
        ListNode hare = head, turtle = head;
        while(hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            if(hare == turtle) {
                hasCycle = true;
                break;
            }
        }
        return hasCycle;
    }
}