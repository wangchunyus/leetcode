

//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
// Related Topics 链表 双指针 
// 👍 1415 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;

/**
 * 19.删除链表的倒数第 N 个结点.remove-nth-node-from-end-of-list
 *
 * @author wangcy
 * @since 2021-06-18 16:23:18
 **/

public class Solution_19 {
    public static void main(String[] args) {
        Solution solution = new Solution_19().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            //定义一个虚拟指针指向头节点
            ListNode virtualNode = new ListNode(0, head);
            ListNode moveNode = virtualNode;
            int nodeLength = getNodeLength(head);
            for (int i = 0; i < nodeLength - n; i++) {
                moveNode = moveNode.next;//一直循环移动节点到 删除节点的前一个节点
            }
            moveNode.next = moveNode.next.next;
            ListNode res = virtualNode.next;
            return res;
        }

        public int getNodeLength(ListNode head) {
            int length = 0;
            while (head != null) {
                length++;
                head = head.next;
            }
            return length;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}