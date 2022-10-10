

//给定一个 row x col 的二维网格地图 grid ，其中：grid[i][j] = 1 表示陆地， grid[i][j] = 0 表示水域。 
//
// 网格中的格子 水平和垂直 方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。 
//
// 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿
//的周长。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//输出：16
//解释：它的周长是上面图片中的 16 个黄色的边 
//
// 示例 2： 
//
// 
//输入：grid = [[1]]
//输出：4
// 
//
// 示例 3： 
//
// 
//输入：grid = [[1,0]]
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// row == grid.length 
// col == grid[i].length 
// 1 <= row, col <= 100 
// grid[i][j] 为 0 或 1 
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 558 👎 0


package array数组.leetcode.editor.cn;

import java.awt.image.RGBImageFilter;

/**
 * 463.岛屿的周长.island-perimeter
 *
 * @author wangcy
 * @since 2022-06-06 10:15:36
 **/

public class Solution_463 {
    public static void main(String[] args) {
        Solution solution = new Solution_463().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int islandPerimeter(int[][] grid) {
            //循环行
            for (int r = 0; r < grid.length; r++) {
                //循环列
                for (int c = 0; c < grid[0].length; c++) {
                    //如果 第一个方格的值是 1我们开始从第一个计算  如果是0 就越过
                    if (grid[r][c] == 1) {
                        return dfs(grid, r, c);
                    }
                }
            }
            return 0;
        }

        private int dfs(int[][] grid, int r, int c) {
            //如果从一个岛屿方格走向网格边界了  周长+1
            if(!(0 <= r && r<grid.length && 0 <= c && c< grid[0].length)){
                return 1;
            }
            //从一个岛屿走向 水域 周长+1
            if(grid[r][c] == 0){
                return 1;
            }
            //表示已经搜搜过了 标记为2的方格 返回周长0
            if(grid[r][c] != 1){
                return 0;
            }
            grid[r][c] = 2;
            return dfs(grid,r,c-1)+
                    dfs(grid,r,c+1)+
                    dfs(grid,r-1,c)+
                    dfs(grid,r+1,c);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}