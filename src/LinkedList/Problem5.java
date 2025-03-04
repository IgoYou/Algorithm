package LinkedList;

import ArrayList.Array;

/**
 * 回文链表
 *
 * @author sanhuzhen
 * @time 3/3/25 7:03 PM
 */
public class Problem5 {

    public static void main(String[] args) {
        ListNode p = ListNode.createLinkedList(new int[]{1, 1, 2, 1});
        System.out.println(isPalindrome(p));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p = head, p1 = reverseList(slow);
        while (p1 != null) {
            if (p.val != p1.val) return false;
            p = p.next;
            p1 = p1.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    // 递归遍历单链表
    static void traverse(ListNode head) {
        if (head != null) {
            // 前序遍历代码
            System.out.println(head.val);
            traverse(head.next);
            // 后序遍历代码
        }
    }
}
