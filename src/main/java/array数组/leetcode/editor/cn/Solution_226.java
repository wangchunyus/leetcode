

//给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [4,2,7,1,3,6,9]
//输出：[4,7,2,9,6,3,1]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：root = [2,1,3]
//输出：[2,3,1]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目范围在 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1321 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;
import array数组.leetcode.editor.cn.util.TreeNodeUtil;

/**
 * 226.翻转二叉树.invert-binary-tree
 *
 * @author wangcy
 * @since 2022-06-14 10:13:47
 **/

public class Solution_226 {
    public static void main(String[] args) {

        Solution solution = new Solution_226().new Solution();
        Integer[] arr = {4, 2, null};
        TreeNode build = TreeNodeUtil.build(arr);
        TreeNode treeNode = solution.invertTree(build);
        System.out.println(treeNode);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
            return root;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

  }