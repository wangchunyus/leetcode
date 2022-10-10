

//给定一个非负整数数组 nums， nums 中一半整数是 奇数 ，一半整数是 偶数 。 
//
// 对数组进行排序，以便当 nums[i] 为奇数时，i 也是 奇数 ；当 nums[i] 为偶数时， i 也是 偶数 。 
//
// 你可以返回 任何满足上述条件的数组作为答案 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [4,2,5,7]
//输出：[4,5,2,7]
//解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,3]
//输出：[2,3]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 2 * 10⁴ 
// nums.length 是偶数 
// nums 中一半是偶数 
// 0 <= nums[i] <= 1000 
// 
//
// 
//
// 进阶：可以不使用额外空间解决问题吗？ 
// Related Topics 数组 双指针 排序 👍 244 👎 0


package array数组.leetcode.editor.cn;

/**
 * 922.按奇偶排序数组 II.sort-array-by-parity-ii
 *
 * @author wangcy
 * @since 2022-07-05 17:07:20
 **/

public class Solution_922 {
    public static void main(String[] args) {
        Solution solution = new Solution_922().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];

            int i = 0;
            for (int x : nums) {
                if (x % 2 == 0) {
                    ans[i] = x;
                    i += 2;
                }
            }
            i = 1;
            for (int x : nums) {
                if (x % 2 == 1) {
                    ans[i] = x;
                    i += 2;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}