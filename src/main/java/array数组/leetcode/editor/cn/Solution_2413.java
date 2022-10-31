

//给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
//
// 
//
// 示例 1： 
//
// 输入：n = 5
//输出：10
//解释：5 和 2 的最小公倍数是 10 。
// 
//
// 示例 2： 
//
// 输入：n = 6
//输出：6
//解释：6 和 2 的最小公倍数是 6 。注意数字会是它自身的倍数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 150 
// 
//
// Related Topics 数学 数论 👍 11 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 2413.最小偶倍数.smallest-even-multiple
 *
 * @author wangcy
 * @since  2022-10-31 16:14:31
 **/

  public class Solution_2413{
      public static void main(String[] args) {
           Solution solution = new Solution_2413().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestEvenMultiple(int n) {

                // 如果该数为偶数
                // 那该数就是它和2的最小公倍数
                if(n % 2 == 0)
                    return n;
                    // 如果该数是奇数
                    // 则该数与2相乘的结果为最小公倍数
                else
                    return 2*n;
            }

}
//leetcode submit region end(Prohibit modification and deletion)

  }