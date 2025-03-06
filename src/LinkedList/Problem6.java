package LinkedList;

/**
 * 反转链表
 * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/6/25 8:50 PM
 */
public class Problem6 {
    public static void main(String[] args) {

    }
    // 1. 使用递归，时间和空间都是O(n)
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    // 2.
    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
