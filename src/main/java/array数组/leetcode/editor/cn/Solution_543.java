

//给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。 
//
// 
//
// 示例 : 
//给定二叉树 
//
//           1
//         / \
//        2   3
//       / \     
//      4   5    
// 
//
// 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。 
//
// 
//
// 注意：两结点之间的路径长度是以它们之间边的数目表示。 
// Related Topics 树 深度优先搜索 二叉树 👍 1063 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;
import array数组.leetcode.editor.cn.util.TreeNodeUtil;

/**
 * 543.二叉树的直径.diameter-of-binary-tree
 *
 * @author wangcy
 * @since  2022-06-13 15:33:20
 **/

  public class Solution_543{
      public static void main(String[] args) {

          Solution solution = new Solution_543().new Solution();
          Integer[] arr = {1,2,3,4,5};
          TreeNode build = TreeNodeUtil.build(arr);
          int i = solution.nodeHeight(build);
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
    int maxNum ;
    public int diameterOfBinaryTree(TreeNode root) {
        maxNum = 1;
        int i = nodeHeight(root);
        return maxNum-1;
    }

    public  int  nodeHeight(TreeNode node){
        if(node == null) return 0;
        //获取左节点的深度
        int left = nodeHeight(node.left);
        //获取右节点的深度
        int right = nodeHeight(node.right);
        maxNum = Math.max(maxNum,left+right+1);
        return Math.max(left,right)+1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }