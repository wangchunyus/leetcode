


//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。 
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
// Related Topics 链表 双指针 👍 366 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;
import array数组.leetcode.editor.cn.util.ListNodeUtil;

/**
 * 剑指 Offer 22.链表中倒数第k个节点.lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 *
 * @author wangcy
 * @since  2022-06-16 14:36:36
 **/

class Offer_22{
      public static void main(String[] args) {

          Solution solution = new Offer_22().new Solution();
          int[] ar = {1,2,3,4,5};
          ListNode builder = ListNodeUtil.builder(ar);
          ListNode kthFromEnd = solution.getKthFromEnd(builder, 2);
          System.out.println(kthFromEnd);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode cooyNode = head;
        while (cooyNode != null){
            count++;
            cooyNode = cooyNode.next;
        }
        ListNode resultNode = head;
        for (int i = 0; i < count-k; i++) {
            resultNode = resultNode.next;
        }
        return resultNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }