

//给定一个二叉树，检查它是否是镜像对称的。 
//
// 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
//     1
//   / \
//  2   2
// / \ / \
//3  4 4  3
// 
//
// 
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
//     1
//   / \
//  2   2
//   \   \
//   3    3
// 
//
// 
//
// 进阶： 
//
// 你可以运用递归和迭代两种方法解决这个问题吗？ 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 
// 👍 1421 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 101.对称二叉树.symmetric-tree
 *
 * @author wangcy
 * @since  2021-06-24 16:48:07
 **/

  public class Solution_101{
      public static void main(String[] args) {
           Solution solution = new Solution_101().new Solution();
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
    public boolean isSymmetric(TreeNode root) {

        return check(root,root);

    }
    public boolean check(TreeNode u,TreeNode v){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(u);
        queue.offer(v);
        while (!queue.isEmpty()){
             u = queue.poll();//第一个插入队列的二叉树
             v = queue.poll();//第二个插入队列的二叉树
            if(u == null && v == null ) continue;
            if((u == null || v == null) || u.val != v.val){
                return false; //队列中如果出现左右子树其中之一不存在 或者 同时存在 但是 值不相等  代表不是 镜像
            }
            //前一层树已经比较完毕  开始向队列插入下一层需要对比的 左右树
            //注意 插入队列的顺序
            queue.offer(u.left);
            queue.offer(v.right);

            queue.offer(u.right);
            queue.offer(v.left);
        }
        return  true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }