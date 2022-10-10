

//给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。 
//
// 叶子节点 是指没有子节点的节点。 
// 
//
// 示例 1： 
//
// 
//输入：root = [1,2,3,null,5]
//输出：["1->2->5","1->3"]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：["1"]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [1, 100] 内 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 字符串 回溯 二叉树 👍 756 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257.二叉树的所有路径.binary-tree-paths
 *
 * @author wangcy
 * @since 2022-06-15 14:43:48
 **/

public class Solution_257 {
    public static void main(String[] args) {
        Solution solution = new Solution_257().new Solution();
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new ArrayList<>();
            treeNodeAllPaths(result,"",root);
            return result;
        }

        private void treeNodeAllPaths(List<String> result, String s, TreeNode root) {
            if(root != null) {
                //先将跟节点加入到buffer中
                StringBuffer stringBuffer = new StringBuffer(s);
                stringBuffer.append(root.val+"");
                if(root.left == null && root.right == null) {//当前为叶子节点
                    result.add(stringBuffer.toString());
                }else {
                    stringBuffer.append("->");
                    treeNodeAllPaths(result,stringBuffer.toString(),root.left);
                    treeNodeAllPaths(result,stringBuffer.toString(),root.right);
                }
            }
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

  }