import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = toNumber(l1);
        BigInteger num2 = toNumber(l2);

        String sum = num1.add(num2).toString();

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Read backwards to store digits in reverse order.
        for (int i = sum.length() - 1; i >= 0; i--) {
            int digit = sum.charAt(i) - '0';

            tail.next = new ListNode(digit);
            tail = tail.next;
        }

        return dummy.next;
    }

    private BigInteger toNumber(ListNode head) {
        StringBuilder digits = new StringBuilder();

        while (head != null) {
            digits.append(head.val);
            head = head.next;
        }

        // List digits are stored in reverse order.
        digits.reverse();

        return new BigInteger(digits.toString());
    }
}
