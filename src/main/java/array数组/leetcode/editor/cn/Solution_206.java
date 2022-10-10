

//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
// 
// 
// Related Topics 链表 
// 👍 1792 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;

/**
 * 206.反转链表.reverse-linked-list
 *
 * @author wangcy
 * @since 2021-06-18 17:33:14
 **/

public class Solution_206 {
    public static void main(String[] args) {
        Solution solution = new Solution_206().new Solution();
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
        public ListNode reverseList(ListNode head) {
            //定义一个新链表
            ListNode newNode = null;
            while (head != null) {
                ListNode temp = head.next;
                head.next = newNode;
                //更细新链表
                newNode = head;
                head = temp;
            }
            return newNode;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}