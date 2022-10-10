

//给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：[[1,2,3],[8,9,4],[7,6,5]]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 
// Related Topics 数组 矩阵 模拟 👍 774 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 59.螺旋矩阵 II.spiral-matrix-ii
 *
 * @author wangcy
 * @since  2022-08-08 15:42:00
 **/

  public class Solution_59{
      public static void main(String[] args) {
           Solution solution = new Solution_59().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] mar = new int[n][n];
        int upper = 0;
        int lower = n-1;
        int left = 0;
        int right = n-1;
        int num = 1;
        while (num <= n*n){
            //顶部从左到右
            if(upper <= lower){
                for (int i = left; i <=right ; i++) {
                    mar[upper][i] = num++;
                }
                //上面下移一位
                upper++;
            }
            //右边开始 从上到下
            if(left <= right){
                for (int i = upper; i <=lower ; i++) {
                    mar[i][right] = num++;
                }
                //右边左移一位
                right--;
            }
            //底部开始 从右到左
            if(upper <=lower){
                for (int i = right; i >=left ; i--) {
                    mar[lower][i] = num++;
                }
                //底部向上移动一位
                lower--;
            }
            //左边开始  从下到上
            if(left <= right){
                for (int i = lower; i >= upper ; i--) {
                    mar[i][left] = num++;
                }
                //左边界右移一位
                left++;
            }
        }
        return mar;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }