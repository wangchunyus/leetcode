

//给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。 
//
// 进阶：不要 使用任何内置的库函数，如 sqrt 。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 16
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：num = 14
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 2^31 - 1 
// 
// Related Topics 数学 二分查找 👍 406 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 367.有效的完全平方数.valid-perfect-square
 *
 * @author wangcy
 * @since  2022-06-29 17:43:55
 **/

  public class Solution_367{
      public static void main(String[] args) {

          Solution solution = new Solution_367().new Solution();
          boolean perfectSquare = solution.isPerfectSquare(100);
          System.out.println(perfectSquare);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <=right){
            int mid = (right-left)/2+left;
            long l = (long) mid * mid;
            if(l  > num){
                right = mid-1;
            }else if(l < num){
                left = mid+1;
            }else {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }