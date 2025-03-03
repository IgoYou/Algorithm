package LinkedList;

/**
 * 单链表的倒数第 k 个节点
 *
 * @author sanhuzhen
 * @time 3/3/25 4:15
 */
public class Problem1 {
    /**
     * 找到倒数第 k 个节点，我们一般都是用 n - k + 1 来找倒数的节点，n是链表总的节点个数，但这样我们实现并不知道链表总的节点个数，只能先遍历一遍得到总的链表个数，这样有点麻烦了
     * <p>
     * 我们可以通过一次遍历既可以得到
     *
     * @param head
     * @param k
     * @return p2
     */
    private ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        // 让p1先走k步
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;

        //让 p1 和 p2 同时走 n - k 步，故 p2 所在的节点即为 n-k+1
        while (p1 != null) {
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
