

//给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
//输出：32
// 
//
// 示例 2： 
// 
// 
//输入：root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 2 * 10⁴] 内 
// 1 <= Node.val <= 10⁵ 
// 1 <= low <= high <= 10⁵ 
// 所有 Node.val 互不相同 
// 
//
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 320 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 938.二叉搜索树的范围和.range-sum-of-bst
 *
 * @author wangcy
 * @since  2023-04-24 15:28:48
 **/

  public class Solution_938{
      public static void main(String[] args) {
           Solution solution = new Solution_938().new Solution();
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> sumList = new ArrayList<>();
        dfs(root,sumList,low,high);
        int sum = sumList.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    private void dfs(TreeNode root, List<Integer> sumList, int low, int high) {
          if(root == null){
              return;
          }
          if(root.val >= low && root.val <= high){
              sumList.add(root.val);
          }
          dfs(root.left,sumList,low,high);
          dfs(root.right,sumList,low,high);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }