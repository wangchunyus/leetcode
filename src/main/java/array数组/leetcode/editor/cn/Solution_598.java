

//给你一个 m x n 的矩阵 M ，初始化时所有的 0 和一个操作数组 op ，其中 ops[i] = [ai, bi] 意味着当所有的 0 <= x < 
//ai 和 0 <= y < bi 时， M[x][y] 应该加 1。 
//
// 在 执行完所有操作后 ，计算并返回 矩阵中最大整数的个数 。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入: m = 3, n = 3，ops = [[2,2],[3,3]]
//输出: 4
//解释: M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
// 
//
// 示例 2: 
//
// 
//输入: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2]
//,[3,3],[3,3],[3,3]]
//输出: 4
// 
//
// 示例 3: 
//
// 
//输入: m = 3, n = 3, ops = []
//输出: 9
// 
//
// 
//
// 提示: 
//
// 
//
// 
// 1 <= m, n <= 4 * 10⁴ 
// 0 <= ops.length <= 10⁴ 
// ops[i].length == 2 
// 1 <= ai <= m 
// 1 <= bi <= n 
// 
// Related Topics 数组 数学 👍 164 👎 0


package array数组.leetcode.editor.cn;

/**
 * 598.范围求和 II.range-addition-ii
 *
 * @author wangcy
 * @since 2022-06-07 16:09:40
 **/

public class Solution_598 {
    public static void main(String[] args) {
        Solution solution = new Solution_598().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxCount(int m, int n, int[][] ops) {
            for (int[] op : ops) {
                m = Math.min(m, op[0]);
                n = Math.min(n, op[1]);
            }
            return m * n;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

  }