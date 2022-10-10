

//对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。 
//
// 给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 28
//输出：true
//解释：28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, 和 14 是 28 的所有正因子。 
//
// 示例 2： 
//
// 
//输入：num = 7
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10⁸ 
// 
// Related Topics 数学 👍 180 👎 0


package array数组.leetcode.editor.cn;

/**
 * 507.完美数.perfect-number
 *
 * @author wangcy
 * @since 2022-07-11 17:56:33
 **/

public class Solution_507 {
    public static void main(String[] args) {
        Solution solution = new Solution_507().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkPerfectNumber(int num) {
            if (num == 1) {
                return false;
            }

            int sum = 1;
            for (int d = 2; d * d <= num; ++d) {
                if (num % d == 0) {
                    sum += d;
                    if (d * d < num) {
                        sum += num / d;
                    }
                }
            }
            return sum == num;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}