package LinkedList;

/**
 * 求两个链表相交节点
 *
 * @author sanhuzhen
 * @time 3/3/25 4:56 PM
 */
public class Problem4 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        while(p1!=p2){
            // p1 向前走，如果走到尽头，在遍历一遍headB
            if(p1==null) {
                p1=headB;
            }else{
                p1=p1.next;
            }
            //同理，p2
            if(p2==null){
                p2=headA;
            }else{
                p2=p2.next;
            }
        }
        return p1;
    }
}
