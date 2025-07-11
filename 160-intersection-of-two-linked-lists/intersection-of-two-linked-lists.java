/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    HashMap<ListNode, Boolean> h1 = new HashMap<>();
    
    ListNode tempA = headA;
    while (tempA != null) {
        h1.put(tempA, true);
        tempA = tempA.next;
    }

    ListNode tempB = headB;
    while (tempB != null) {
        if (h1.containsKey(tempB)) {
            return tempB;
        }
        tempB = tempB.next;
    }

    return null;
}
}