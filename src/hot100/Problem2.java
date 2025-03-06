package hot100;

import LinkedList.ListNode;

/**
 * @author sanhuzhen
 * @time 3/3/25 10:19 PM
 */
public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l2==null) return null;
        ListNode dump1 = new ListNode(-1);
        ListNode dump = dump1;
        int sum = 0;
        while(l1!=null&&l2!=null){
            sum += (l1.val + l2.val);
            if(sum>=10){
                dump.next = new ListNode(sum-10);
                sum/=10;
            }else{
                dump.next = new ListNode(sum);
                sum=0;
            }
            dump=dump.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null) {
            sum += l1.val;
            l1=l1.next;
            if(sum>=10){
                dump.next = new ListNode(sum-10);
                sum/=10;
            }else{
                dump.next = new ListNode(sum);
                sum=0;
            }
            dump=dump.next;
        }
        while(l2!=null){
            sum += l2.val;
            l2=l2.next;
            if(sum>=10){
                dump.next = new ListNode(sum-10);
                sum/=10;
            }else{
                dump.next = new ListNode(sum);
                sum=0;
            }
            dump=dump.next;
        }
        if(sum!=0){
            dump.next = new ListNode(sum);
        }
        return dump1.next;
    }
}
