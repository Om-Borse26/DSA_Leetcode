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
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode last = null;

        int carry = 0;

        while(p1 != null && p2 != null){
            int sum = p1.val + p2.val + carry;
            p1.val = sum % 10;
            carry = sum / 10;
            last = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        while(p2 != null){
            int sum = p2.val + carry;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            last.next = newNode;
            last = newNode;
            p2 = p2.next;
        }
        while(p2 != null){
            int sum = p2.val + carry;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            last.next = newNode;
            last = newNode;
            p2 = p2.next;
        }

        while(p1 != null){
            int sum = p1.val + carry;
            p1.val = sum % 10;
            carry = sum / 10;
            last = p1;
            p1 = p1.next;
        }

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            last.next = newNode;
        }
        return l1;
    }
}