

//给你一个 n * n 的网格 grid ，上面放置着一些 1 x 1 x 1 的正方体。每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单
//元格 (i, j) 上。 
//
// 放置好正方体后，任何直接相邻的正方体都会互相粘在一起，形成一些不规则的三维形体。 
//
// 请你返回最终这些形体的总表面积。 
//
// 注意：每个形体的底面也需要计入表面积中。 
//
// 
//
// 
// 
//
// 示例 1： 
// 
// 
//输入：grid = [[1,2],[3,4]]
//输出：34
// 
//
// 示例 2： 
// 
// 
//输入：grid = [[1,1,1],[1,0,1],[1,1,1]]
//输出：32
// 
//
// 示例 3： 
// 
// 
//输入：grid = [[2,2,2],[2,1,2],[2,2,2]]
//输出：46
// 
//
// 
//
// 提示： 
//
// 
// n == grid.length 
// n == grid[i].length 
// 1 <= n <= 50 
// 0 <= grid[i][j] <= 50 
// 
//
// Related Topics 几何 数组 数学 矩阵 👍 172 👎 0


package array数组.leetcode.editor.cn;

/**
 * 892.三维形体的表面积.surface-area-of-3d-shapes
 *
 * @author wangcy
 * @since 2023-04-25 16:06:25
 **/

public class Solution_892 {
    public static void main(String[] args) {
        Solution solution = new Solution_892().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int surfaceArea(int[][] grid) {

            int[] dr = new int[]{0, 1, 0, -1};
            int[] dc = new int[]{1, 0, -1, 0};

            int N = grid.length;
            int ans = 0;

            for (int r = 0; r < N; ++r) {
                for (int c = 0; c < N; ++c) {
                    if (grid[r][c] > 0) {
                        ans += 2;
                        for (int k = 0; k < 4; ++k) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            int nv = 0;
                            if (0 <= nr && nr < N && 0 <= nc && nc < N) {
                                nv = grid[nr][nc];
                            }

                            ans += Math.max(grid[r][c] - nv, 0);
                        }
                    }
                }
            }
            return ans;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}