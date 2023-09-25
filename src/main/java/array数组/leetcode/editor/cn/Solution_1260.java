

//给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。 
//
// 每次「迁移」操作将会引发下述活动： 
//
// 
// 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。 
// 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。 
// 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。 
// 
//
// 请你返回 k 次迁移操作后最终得到的 二维网格。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
//输出：[[9,1,2],[3,4,5],[6,7,8]]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
//输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
// 
//
// 示例 3： 
//
// 
//输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
//输出：[[1,2,3],[4,5,6],[7,8,9]]
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m <= 50 
// 1 <= n <= 50 
// -1000 <= grid[i][j] <= 1000 
// 0 <= k <= 100 
// 
//
// Related Topics 数组 矩阵 模拟 👍 119 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260.二维网格迁移.shift-2d-grid
 *
 * @author wangcy
 * @since 2023-06-02 09:03:39
 **/

public class Solution_1260 {
    public static void main(String[] args) {
        Solution solution = new Solution_1260().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            List<List<Integer>> res = new ArrayList<>();
            int row = grid.length;
            int low = grid[0].length;
            for (int i = 0; i < k; i++) {
                int last = 0;
                for (int j = 0; j < row; j++) {
                    int temp = 0;
                    for (int m = 0; m < low; m++) {
                        temp = grid[j][m - 1];
                        grid[j][m + 1] = grid[j][m];
                    }
                    if (j != 0) {
                        grid[j][0] = temp;
                    }
                    if (j == row - 1) {
                        last = temp;
                    }
                }
                grid[0][0] = last;
            }
            for (int p = 0; p < row; p++) {
                List<Integer> r = new ArrayList<>();
                for (int q = 0; q < low; q++) {
                    r.add(grid[p][q]);
                }
                res.add(r);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}