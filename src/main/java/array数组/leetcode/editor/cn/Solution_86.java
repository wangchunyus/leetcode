

//给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。 
//
// 你应当 保留 两个分区中每个节点的初始相对位置。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,4,3,2,5,2], x = 3
//输出：[1,2,2,4,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [2,1], x = 2
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 200] 内 
// -100 <= Node.val <= 100 
// -200 <= x <= 200 
// 
// Related Topics 链表 双指针 👍 596 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.ListNode;

import java.lang.invoke.VarHandle;
import java.util.List;

/**
 * 86.分隔链表.partition-list
 *
 * @author wangcy
 * @since  2022-07-27 11:13:14
 **/

  public class Solution_86{
      public static void main(String[] args) {
           Solution solution = new Solution_86().new Solution();
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
    public ListNode partition(ListNode head, int x) {
        //小链表 虚拟节点
        ListNode dumpLittle = new ListNode(-1);
        //大链表 虚拟节点
        ListNode  dumpBig = new ListNode(-1);
        //定义2个指针分别指向 大小虚拟节点
        ListNode p1 = dumpLittle,p2 = dumpBig;
        //定义一个指针指向头结点
        ListNode p = head;
        while (p != null){
            if(p.val >= x){
                //存到大链表中
                p2.next = p;
                p2 = p2.next;
            }else{
                //存到小链表这ongoing
                p1.next = p;
                p1 = p1.next;
            }
            //清除p指向的复杂的链表 避免出问题
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        //将 大小链表接到一起
        p1.next = dumpBig.next;
        return dumpLittle.next;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }