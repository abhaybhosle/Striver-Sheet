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

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Invalid input or cannot delete the last node using this method
            return;
        }

        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Update the current node's 'next' pointer to skip the next node
        node.next = node.next.next;
    }
}

public class Day2Q4 {
    public static void main(String[] args) {
        // Example usage for checking palindrome
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        Solution solution = new Solution();
        boolean isPalindrome = solution.isPalindrome(head1);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);

        // Example usage for deleting a node
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        System.out.println("\nBefore deleting node with value 3:");
        printLinkedList(head2);

        // Delete node with value 3
        ListNode nodeToDelete = head2.next.next;
        solution.deleteNode(nodeToDelete);

        System.out.println("\nAfter deleting node with value 3:");
        printLinkedList(head2);
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
