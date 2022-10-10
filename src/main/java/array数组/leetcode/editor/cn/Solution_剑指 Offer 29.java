


//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 矩阵 模拟 👍 418 👎 0


package array数组.leetcode.editor.cn;

/**
 * 剑指 Offer 29.顺时针打印矩阵.shun-shi-zhen-da-yin-ju-zhen-lcof
 *
 * @author wangcy
 * @since 2022-06-21 09:59:59
 **/

class Offer_29 {
    public static void main(String[] args) {

        Solution solution = new Offer_29().new Solution();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.spiralOrder(arr);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int row = matrix.length;
            if (row == 0) {
                return new int[0];
            }
            int col = matrix[0].length;
            int[] res = new int[row * col];
            int idx = 0;
            int left = 0, top = 0, right = col - 1, bottom = row - 1;
            while (true) {
                //从左往右走
                for (int i = left; i <= right; i++) {
                    res[idx++] = matrix[top][i];
                }
                if (++top > bottom) {
                    break;
                }
                //从上往下走
                for (int i = top; i <= bottom; i++) {
                    res[idx++] = matrix[i][right];
                }
                if (--right < left) {
                    break;
                }
                //从右往左走
                for (int i = right; i >= left; i--) {
                    res[idx++] = matrix[bottom][i];
                }
                if (--bottom < top) {
                    break;
                }
                //从下往上走
                for (int i = bottom; i >= top; i--) {
                    res[idx++] = matrix[i][left];
                }
                if (++left > right) {
                    break;
                }
            }
            return res;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}