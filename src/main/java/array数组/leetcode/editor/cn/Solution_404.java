

//给定二叉树的根节点 root ，返回所有左叶子之和。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入: root = [3,9,20,null,null,15,7] 
//输出: 24 
//解释: 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
// 
//
// 示例 2: 
//
// 
//输入: root = [1]
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 节点数在 [1, 1000] 范围内 
// -1000 <= Node.val <= 1000 
// 
//
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 464 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;
import array数组.leetcode.editor.cn.util.TreeNodeUtil;

/**
 * 404.左叶子之和.sum-of-left-leaves
 *
 * @author wangcy
 * @since  2022-06-15 15:14:34
 **/

  public class Solution_404{
      public static void main(String[] args) {

          Solution solution = new Solution_404().new Solution();
          Integer[] arr = {1,2,3,4,5};
          TreeNode build = TreeNodeUtil.build(arr);
          int i = solution.sumOfLeftLeaves(build);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = new int[1];
        leftSum(root,sum,false);
        return sum[0];
    }

    private void leftSum(TreeNode root,int[] sum,boolean isleft) {
        if(root != null){
            if(root.left == null && root.right == null && isleft){
                sum[0] +=root.val;
            }
            leftSum(root.left,sum,true);
            leftSum(root.right,sum,false);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }