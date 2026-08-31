/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }

        int length=1;
        ListNode tail = head;
        while(tail.next != null){
            tail= tail.next;
            length++;
        }

        int n = k % length;
        if(n==0){
            return head;
        }
        tail.next = head;
        int newTail= length-n;
        ListNode temp = head;
        for(int i =1;i<newTail;i++){
            temp = temp.next;

        }
        ListNode newHead = temp.next;
        temp.next =null;
        return newHead;


    }
}
