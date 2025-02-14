package LinkedList;

/**
 * @author：sanhuzhen
 * @time：2025/2/14 21:26
 * @description：链表
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    // 将数组转变为单链表
    static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList(new int[]{0, 1, 2, 3, 4, 5});

        // 增加
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        head = newHead;

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(6);

        for (ListNode p = head; p != null; p = p.next) {
            System.out.println(p.val);
        }
    }

}
