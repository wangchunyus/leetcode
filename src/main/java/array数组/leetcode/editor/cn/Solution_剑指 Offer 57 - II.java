


//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// Related Topics 数学 双指针 枚举 👍 449 👎 0


package array数组.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 57 - II.和为s的连续正数序列.he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 *
 * @author wangcy
 * @since 2022-06-28 15:52:51
 **/

class Offer_57_II {
    public static void main(String[] args) {

        Solution solution = new Offer_57_II().new Solution();
        int[][] continuousSequence = solution.findContinuousSequence(9);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] findContinuousSequence(int target) {
            List<int[]> vec = new ArrayList<int[]>();
            int sum = 0, limit = (target - 1) / 2;
            for (int i = 1; i <= limit; ++i) {
                for (int j = i; ; ++j) {
                    sum += j;
                    if (sum > target) {
                        sum = 0;
                        break;
                    } else if (sum == target) {
                        int[] res = new int[j - i + 1];
                        for (int k = i; k <= j; ++k) {
                            res[k - i] = k;
                        }
                        vec.add(res);
                        sum = 0;
                        break;
                    }
                }
            }
            return vec.toArray(new int[vec.size()][]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}