

//给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。 
//
// 
//
// 示例 1： 
//
// 输入：low = 3, high = 7
//输出：3
//解释：3 到 7 之间奇数数字为 [3,5,7] 。 
//
// 示例 2： 
//
// 输入：low = 8, high = 10
//输出：1
//解释：8 到 10 之间奇数数字为 [9] 。 
//
// 
//
// 提示： 
//
// 
// 0 <= low <= high <= 10^9 
// 
// Related Topics 数学 👍 56 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;

/**
 * 1523.在区间范围内统计奇数数目.count-odd-numbers-in-an-interval-range
 *
 * @author wangcy
 * @since 2022-07-20 14:05:00
 **/

public class Solution_1523 {
    public static void main(String[] args) {
        Solution solution = new Solution_1523().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countOdds(int low, int high) {
            return pre(high) - pre(low - 1);
        }
        public int pre(int x) {
            return (x + 1) >> 1;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

  }