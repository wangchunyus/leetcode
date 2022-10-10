


//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 递归 链表 👍 448 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;
import array数组.leetcode.editor.cn.util.ListNodeUtil;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 剑指 Offer 24.反转链表.fan-zhuan-lian-biao-lcof
 *
 * @author wangcy
 * @since 2022-06-27 17:42:19
 **/

class Offer_24 {
    public static void main(String[] args) {

        Solution solution = new Offer_24().new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode builder = ListNodeUtil.builder(arr);
        ListNode listNode = solution.reverseList(builder);

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}