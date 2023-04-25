

//给你一棵二叉搜索树的
// root ，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
//输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
// 
//
// 示例 2： 
// 
// 
//输入：root = [5,1,7]
//输出：[1,null,5,null,7]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数的取值范围是 [1, 100] 
// 0 <= Node.val <= 1000 
// 
//
// Related Topics 栈 树 深度优先搜索 二叉搜索树 二叉树 👍 322 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.Node;
import array数组.leetcode.editor.cn.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 897.递增顺序搜索树.increasing-order-search-tree
 *
 * @author wangcy
 * @since 2023-04-25 11:05:10
 **/

public class Solution_897 {
    public static void main(String[] args) {
        Solution solution = new Solution_897().new Solution();
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
        public TreeNode increasingBST(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            inorder(root, res);

            TreeNode dummyNode = new TreeNode(-1);
            TreeNode currNode = dummyNode;
            for (int value : res) {
                currNode.right = new TreeNode(value);
                currNode = currNode.right;
            }
            return dummyNode.right;
        }


        public void inorder(TreeNode node, List<Integer> res) {
            if (node == null) {
                return;
            }
            inorder(node.left, res);
            res.add(node.val);
            inorder(node.right, res);
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}