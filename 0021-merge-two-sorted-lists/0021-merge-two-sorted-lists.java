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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode ans = new ListNode(0);
        ListNode tem1 = list1;
        ListNode tem2 = list2;
        ListNode temr = ans;
        while(tem1 != null && tem2 != null){
            
            if(tem1.val <= tem2.val){
                temr.next = new ListNode(tem1.val);
                tem1 = tem1.next;
            }
            else{
                temr.next = new ListNode(tem2.val);
                tem2 = tem2.next;
            }
            temr = temr.next;
        }
        while(tem1!=null){
            temr.next = new ListNode(tem1.val);
            temr = temr.next;
            tem1 = tem1.next;
        }
        while(tem2!=null){
            temr.next = new ListNode(tem2.val);
            temr = temr.next;
            tem2 = tem2.next;
        }
        return ans.next;
    }
}