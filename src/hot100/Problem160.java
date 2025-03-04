package hot100;

import LinkedList.ListNode;

/**
 * @author sanhuzhen
 * @time 3/3/25 10:01 PM
 */
public class Problem160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p1.next;
            }
        }
        return p1;
    }
}
