class PalindromeLinkedList {
    ListNode reverse(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode prev=null,curr=head,fowd=head.next;
        while(fowd!=null){
            curr.next=prev;
            prev=curr;
            curr=fowd;
            fowd=curr.next;
        }
        curr.next=prev;
        return curr;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head,second = newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;
    }
}
