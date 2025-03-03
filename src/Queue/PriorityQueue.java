package Queue;

import LinkedList.ListNode;

/**
 * 优先队列使用
 *
 * @author sanhuzhen
 * @time：2025/2/14
 */
public class PriorityQueue {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        // 虚拟节点
        ListNode dump = new ListNode(-1);
        ListNode p = dump;

        java.util.PriorityQueue<ListNode> pq = new java.util.PriorityQueue<>(
                // 这里将使用comparable接口，将节点从小到大排列
                lists.length, (a, b) -> (a.val - b.val)
        );

        // 将这些节点全部加入队列
        for (ListNode node : lists) {
            if (node != null) pq.add(node);
        }

        // 开始拼凑
        while (!pq.isEmpty()) {
            // 取出
            ListNode node = pq.poll();
            p.next = node;
            // 如果这个节点之后不是空节点，在入队
            if (node.next!=null){
                pq.add(node.next);
            }

            p=p.next;
        }
        return dump.next;

    }
//    public ListNode mergeKLists(ListNode[] lists) {
//        if(lists.length==0) return null;
//        ListNode p=lists[0];
//        for(int i=1;i<lists.length;i++){
//            p = GetListNode(p, lists[i]);
//        }
//        return p;
//    }
//    private ListNode GetListNode(ListNode p1, ListNode p2) {
//        ListNode p = new ListNode(0);
//        ListNode p3=p;
//        while(p1!=null&&p2!=null) {
//            if(p1.val<p2.val) {
//                p.next=p1;
//                p1=p1.next;
//            }else{
//                p.next=p2;
//                p2=p2.next;
//            }
//            p=p.next;
//        }
//        if(p1==null) p.next=p2;
//        if(p2==null) p.next=p1;
//        return p3.next;
//    }
}
