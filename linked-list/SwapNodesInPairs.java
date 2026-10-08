import java.util.ArrayList;
import java.util.List;

// LeetCode 24: Swap Nodes in Pairs
// Approach: Store nodes, swap adjacent references, and rebuild links.
// Time: O(n)
// Extra space: O(n)
// ListNode is provided by LeetCode.

class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        List<ListNode> nodes = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        for (int i = 0; i + 1 < nodes.size(); i += 2) {
            ListNode temp = nodes.get(i);
            nodes.set(i, nodes.get(i + 1));
            nodes.set(i + 1, temp);
        }

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }

        nodes.get(nodes.size() - 1).next = null;

        return nodes.get(0);
    }
}
