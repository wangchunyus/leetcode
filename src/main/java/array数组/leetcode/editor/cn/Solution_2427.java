

//给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目。 
//
// 如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 公因子 。 
//
// 
//
// 示例 1： 
//
// 输入：a = 12, b = 6
//输出：4
//解释：12 和 6 的公因子是 1、2、3、6 。
// 
//
// 示例 2： 
//
// 输入：a = 25, b = 30
//输出：2
//解释：25 和 30 的公因子是 1、5 。 
//
// 
//
// 提示： 
//
// 
// 1 <= a, b <= 1000 
// 
//
// Related Topics 数学 枚举 数论 👍 5 👎 0


package array数组.leetcode.editor.cn;

/**
 * 2427.公因子的数目.number-of-common-factors
 *
 * @author wangcy
 * @since 2022-10-31 16:18:41
 **/

public class Solution_2427 {
    public static void main(String[] args) {
        Solution solution = new Solution_2427().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int commonFactors(int a, int b) {
            int res = 0;
            for (int x = 1; x < Math.min(a, b) + 1; x++) {
                if (a % x == 0 && b % x == 0) {
                    res++;
                }
            }
            return res;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}