

//给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：6
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：24
// 
//
// 示例 3： 
//
// 
//输入：nums = [-1,-2,-3]
//输出：-6
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10⁴ 
// -1000 <= nums[i] <= 1000 
// 
// Related Topics 数组 数学 排序 👍 379 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 628.三个数的最大乘积.maximum-product-of-three-numbers
 *
 * @author wangcy
 * @since  2022-06-07 18:55:18
 **/

  public class Solution_628{
      public static void main(String[] args) {

          Solution solution = new Solution_628().new Solution();
          int[] nums = {-1,-2,-3};
          int i = solution.maximumProduct(nums);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        return Math.max(nums[0]*nums[1]*nums[size-1],nums[size-1]*nums[size-2]*nums[size-3]);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }