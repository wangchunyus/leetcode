

//如果数组是单调递增或单调递减的，那么它是 单调 的。 
//
// 如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = 
//nums[j]，那么数组 nums 是单调递减的。 
//
// 当给定的数组 nums 是单调数组时返回 true，否则返回 false。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：nums = [6,5,4,4]
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,3,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 👍 189 👎 0


package array数组.leetcode.editor.cn;

/**
 * 896.单调数列.monotonic-array
 *
 * @author wangcy
 * @since 2023-04-24 09:22:59
 **/

public class Solution_896 {
    public static void main(String[] args) {

        Solution solution = new Solution_896().new Solution();
        int[] nums = {11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5};
        boolean monotonic = solution.isMonotonic(nums);
        System.out.println(monotonic);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isMonotonic(int[] nums) {
            return isUpOrDown(nums, true) || isUpOrDown(nums, false);
        }

        private boolean isUpOrDown(int[] nums, boolean b) {
            if (b) {
                //递增
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i+1]) {
                        return false;
                    }
                }
            } else {
                //递减
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] < nums[i+1]) {
                        return false;
                    }
                }

            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}