package LinkedList;

/**
 * 找到链表的中间结点
 *
 * @author sanhuzhen
 * @time：3/3/25 4:43 PM
 */
public class Problem2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        /**
         * fast走两步， slow走一步
         */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
