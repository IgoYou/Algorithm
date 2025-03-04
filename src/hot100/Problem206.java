package hot100;

import LinkedList.ListNode;

/**
 * @author sanhuzhen
 * @time 3/3/25 10:13 PM
 */
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
