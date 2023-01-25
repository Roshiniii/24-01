//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
//and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
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
        ListNode l3 = new ListNode(0);
        int carry = 0;
        ListNode head = l3;
        while(l1 != null && l2 != null){
            int value = l1.val+l2.val+carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int value = l1.val+carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int value = l2.val+carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;
        }
        if(carry == 1){
            l3.next = new ListNode(carry);
        }
        return head.next;
    }
}
