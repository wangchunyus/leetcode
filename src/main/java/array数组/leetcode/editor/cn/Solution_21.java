

//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 1762 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;
import array数组.leetcode.editor.cn.util.ListNodeUtil;

/**
 * 21.合并两个有序链表.merge-two-sorted-lists
 *
 * @author wangcy
 * @since  2021-06-21 15:18:19
 **/

  public class Solution_21{
      public static void main(String[] args) {

          Solution solution = new Solution_21().new Solution();
          int[] l1 = {1,2,3};
          int[] l2 = {1,4,5};
          ListNode listNode = solution.mergeTwoLists(ListNodeUtil.builder(l1), ListNodeUtil.builder(l2));

      }
      //leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode newNode =dummy;
        while (l1 != null && l2 != null){
            if(l1.val<l2.val){
                newNode.next = l1;
                l1 = l1.next;
            }else {
                newNode.next = l2;
                l2 = l2.next;
            }
            newNode =newNode.next;
        }
        newNode.next = l1 == null ? l2 : l1;
        return  dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }