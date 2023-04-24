

//给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。 
//
// 返回满足此条件的 任一数组 作为答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,1,2,4]
//输出：[2,4,3,1]
//解释：[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 5000 
// 0 <= nums[i] <= 5000 
// 
//
// Related Topics 数组 双指针 排序 👍 353 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 905.按奇偶排序数组.sort-array-by-parity
 *
 * @author wangcy
 * @since 2023-04-24 10:20:28
 **/

public class Solution_905 {
    public static void main(String[] args) {

        Solution solution = new Solution_905().new Solution();
        int[] nums = {3,1,2,4};
        int[] ints = solution.sortArrayByParity(nums);
        for (int anInt : ints) {
            System.out.print(anInt+",");
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParity(int[] nums) {

            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int temp = 0;
                //左边偶数 直接++
                while (nums[left] % 2 == 0 && left < right) {
                    ++left;
                }
                //右边奇数 直接--
                while (nums[right] % 2 != 0 && left < right) {
                    --right;
                }
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
            return nums;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}