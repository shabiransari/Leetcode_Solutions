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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ll1=l1;
        ListNode ll2=l2;
        ListNode dummy= new ListNode();
        ListNode tail=dummy;
        int carry=0;
        
        while(ll1!=null||ll2!=null){
            int x=(ll1!=null)?ll1.val:0;
            int y=(ll2!=null)?ll2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(ll1!=null)ll1=ll1.next;
            if(ll2!=null)ll2=ll2.next;
            
        }
        if(carry>0)tail.next=new ListNode(carry);
        return dummy.next;
    }
}