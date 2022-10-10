

//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数在范围 [0, 5000] 内 
// -10⁴ <= Node.val <= 10⁴ 
// 
// Related Topics 树 深度优先搜索 二叉树 👍 1042 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;
import array数组.leetcode.editor.cn.util.TreeNodeUtil;

/**
 * 110.平衡二叉树.balanced-binary-tree
 *
 * @author wangcy
 * @since  2022-06-13 14:45:08
 **/

  public class Solution_110{
      public static void main(String[] args) {

          Solution solution = new Solution_110().new Solution();
          Integer[] tree = {3,9,20,null,null,15,7};
          TreeNode treeRoot = TreeNodeUtil.build(tree);
          boolean balanced = solution.isBalanced(treeRoot);
          System.out.println(balanced);



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
    public boolean isBalanced(TreeNode root) {
        return treeHeight(root) != -1;

    }
    public int treeHeight(TreeNode node){
        if(node == null)  return 0;
        int left = treeHeight(node.left);
        if(left == -1) return -1;
        int right = treeHeight(node.right);
        if(right == -1) return -1;
        return Math.abs(left-right) < 2? Math.max(left,right)+1:-1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }