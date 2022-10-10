


//输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。 
//
// 要求时间复杂度为O(n)。 
//
// 
//
// 示例1: 
//
// 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^5 
// -100 <= arr[i] <= 100 
// 
//
// 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/ 
//
// 
// Related Topics 数组 分治 动态规划 👍 545 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 剑指 Offer 42.连续子数组的最大和.lian-xu-zi-shu-zu-de-zui-da-he-lcof
 *
 * @author wangcy
 * @since 2022-06-17 18:26:38
 **/

class Offer_42 {
    public static void main(String[] args) {

        Solution solution = new Offer_42().new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = solution.maxSubArray(arr);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0, maxAns = nums[0];
            for (int x : nums) {
                pre = Math.max(pre + x, x);
                maxAns = Math.max(maxAns, pre);
            }
            return maxAns;
        }

}
//leetcode submit region end(Prohibit modification and deletion)

  }