

//给定一个二叉树，找出其最大深度。 
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 
//给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 
// 👍 908 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;
import array数组.leetcode.editor.cn.util.TreeNodeUtil;

/**
 * 104.二叉树的最大深度.maximum-depth-of-binary-tree
 *
 * @author wangcy
 * @since  2021-06-24 16:16:31
 **/

  public class Solution_104{
      public static void main(String[] args) {

          Solution solution = new Solution_104().new Solution();
          Integer[]  tree = {3,9,20,2,3,15,7};
          TreeNode build = TreeNodeUtil.build(tree);
          solution.maxDepth(build);
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
    public int maxDepth(TreeNode root) {
        if(root == null ) return 0;
        int leftHight = maxDepth(root.left);
        int rightHigth = maxDepth(root.right);
        return Math.max(leftHight,rightHigth)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }