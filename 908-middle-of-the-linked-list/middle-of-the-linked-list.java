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

    // public static int countSize(ListNode head){
    //     int count = 0;
    //     ListNode p1 = head;
    //     while(p1 != null){
    //         p1 = p1.next;
    //         count++;
    //     }
    //     return count;
    // }

    public ListNode middleNode(ListNode head) {
        // int n = countSize(head);
        // int index = 0;
        // ListNode p1 = head;
        // while(index < n/2){
        //     p1 = p1.next;
        //     index++;
        // }

        // head = p1;
        // return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}