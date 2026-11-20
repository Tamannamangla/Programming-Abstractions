import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Add first node of every list
        for(ListNode node : lists) {
            if(node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(!pq.isEmpty()) {

            ListNode smallest = pq.poll();

            temp.next = smallest;
            temp = temp.next;

            if(smallest.next != null) {
                pq.add(smallest.next);
            }
        }

        return dummy.next;
    }
}