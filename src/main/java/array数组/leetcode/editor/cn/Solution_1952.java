

//给你一个整数 n 。如果 n 恰好有三个正除数 ，返回 true ；否则，返回 false 。 
//
// 如果存在整数 k ，满足 n = k * m ，那么整数 m 就是 n 的一个 除数 。 
//
// 
//
// 示例 1： 
//
// 输入：n = 2
//输出：false
//解释：2 只有两个除数：1 和 2 。 
//
// 示例 2： 
//
// 输入：n = 4
//输出：true
//解释：4 有三个除数：1、2 和 4 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 10⁴ 
// 
// Related Topics 数学 👍 18 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 1952.三除数.three-divisors
 *
 * @author wangcy
 * @since  2022-08-09 14:37:56
 **/

  public class Solution_1952{
      public static void main(String[] args) {
           Solution solution = new Solution_1952().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                count++;
            }
        }
        return count == 1? true:false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }