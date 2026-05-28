

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    // Function to detect cycle
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

public class Linkedlistcycle {

    public static void main(String[] args) {

        // Creating linked list:
        // 3 -> 2 -> 0 -> -4
        //      ^         |
        //      |_________|

        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle
        fourth.next = second;

        Solution sol = new Solution();

        boolean ans = sol.hasCycle(head);

        System.out.println("Cycle Present: " + ans);
    }
}
   


