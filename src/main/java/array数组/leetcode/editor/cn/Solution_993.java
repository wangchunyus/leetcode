

//在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。 
//
// 如果二叉树的两个节点深度相同，但 父节点不同 ，则它们是一对堂兄弟节点。 
//
// 我们给出了具有唯一值的二叉树的根节点 root ，以及树中两个不同节点的值 x 和 y 。 
//
// 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true 。否则，返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,2,3,4], x = 4, y = 3
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
//输出：true
// 
//
// 示例 3： 
//
// 
//
// 
//输入：root = [1,2,3,null,4], x = 2, y = 3
//输出：false 
//
// 
//
// 提示： 
//
// 
// 二叉树的节点数介于 2 到 100 之间。 
// 每个节点的值都是唯一的、范围为 1 到 100 的整数。 
// 
//
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 296 👎 0


package array数组.leetcode.editor.cn;

import array数组.leetcode.editor.cn.util.TreeNode;
import array数组.leetcode.editor.cn.util.TreeNodeUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 993.二叉树的堂兄弟节点.cousins-in-binary-tree
 *
 * @author wangcy
 * @since 2023-04-25 15:20:16
 **/

public class Solution_993 {
    public static void main(String[] args) {

        Solution solution = new Solution_993().new Solution();
        Integer[] arr = {1,null,2,3,null,null,4,null,5};
        TreeNode build = TreeNodeUtil.build(arr);
        solution.isCousins(build,1,3);

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

        int xDept;
        int yDept;
        public boolean isCousins(TreeNode root, int x, int y) {

            Map<Integer, Integer> map = new HashMap<>();
            dfs(0, root, new TreeNode(-1), x, y, map);
            if (xDept == yDept && map.get(x) != map.get(y)) {
                return true;
            }
            return false;
        }

        private void dfs(int dept, TreeNode root, TreeNode pNode, int x, int y, Map<Integer, Integer> map) {
            if (root == null) {
                return;
            }
            if (root.val == x) {
                map.put(x, pNode.val);
                xDept = dept;
            } else if (root.val == y) {
                map.put(y, pNode.val);
                yDept = dept;
            }
            dfs(dept+1, root.left, root, x, y, map);
            dfs(dept+1, root.right, root, x, y, map);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}