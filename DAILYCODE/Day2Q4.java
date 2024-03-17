import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> st = new Stack<>();

        while (fast != null && fast.next != null) {
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Adjust slow pointer for odd-length lists
        if (fast != null) {
            slow = slow.next;
        }

        while (!st.isEmpty()) {
            if (st.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}

public class Day2Q4 {
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution solution = new Solution();
        boolean isPalindrome = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
