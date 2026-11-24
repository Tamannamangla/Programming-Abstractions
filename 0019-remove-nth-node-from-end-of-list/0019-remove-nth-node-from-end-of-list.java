class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int l = 1;
        while(temp.next!=null){
            l++;
            temp=temp.next;
        }
        int r = l-n;
         if(r == 0) {
            return head.next;
        }
        ListNode tem2 = head;
        for(int i = 1; i < r; i++){
            tem2 = tem2.next;
        }
        tem2.next = tem2.next.next;
        return head;

    }
}