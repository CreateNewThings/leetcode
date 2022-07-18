import javax.lang.model.element.NestingKind;

/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start

// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        head.next = removeElements(head.next, val);
        if(head.val == val) {
            if(head.next != null){
                head.val = head.next.val;
                head.next = head.next.next;
            } else {
                return null;
            }
        }
        return head;
    }
}
// @lc code=end

