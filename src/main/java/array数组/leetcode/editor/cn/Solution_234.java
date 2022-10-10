

//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 1023 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;

import java.util.ArrayList;

/**
 * 234.回文链表.palindrome-linked-list
 *
 * @author wangcy
 * @since  2021-06-21 16:16:35
 **/

  public class Solution_234{
      public static void main(String[] args) {
           Solution solution = new Solution_234().new Solution();
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
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> integers = new ArrayList<>();

        //将链表的值复制到数组中
        while (head != null){
            integers.add(head.val);
            head = head.next;
        }
        int leftPoint = 0;
        int rightPoint = integers.size()-1;
        while (leftPoint < rightPoint){
            if(integers.get(leftPoint) != integers.get(rightPoint)){
                return false;
            }else {
                leftPoint++;
                rightPoint--;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }