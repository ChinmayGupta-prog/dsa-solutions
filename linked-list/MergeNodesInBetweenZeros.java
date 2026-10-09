class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode write = head;
        ListNode prev = null;
        int sum = 0;

        while (temp != null) {
            if (temp.val != 0) {
                sum += temp.val;
            } else {
                write.val = sum;
                prev = write;
                write = write.next;
                sum = 0;
            }

            temp = temp.next;
        }

        prev.next = null;
        return head;
    }
}
