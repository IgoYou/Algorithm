package hot100;

import LinkedList.ListNode;

/**
 * @author sanhuzhen
 * @time 3/3/25 10:19 PM
 */
public class Problem2 {
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(-1), temp = p;
        int num1 = getNum(l1), num2 = getNum(l2);
        int sum = num1 + num2;
        while (sum >= 10) {
            temp.next = new ListNode(sum % 10);
            sum /= 10;
            temp = temp.next;
        }
        temp.next = new ListNode(sum);
        return p.next;
    }

    public static int getNum(ListNode head) {
        int temp = 1, sum = 0;
        head = head.next;
        while (head != null) {
            temp *= 10;
            sum += head.val * temp;
            head = head.next;
        }
        return sum;
    }
}
