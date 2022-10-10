

//给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。 
//
// 两个数的 最大公约数 是能够被两个数整除的最大正整数。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,5,6,9,10]
//输出：2
//解释：
//nums 中最小的数是 2
//nums 中最大的数是 10
//2 和 10 的最大公约数是 2
// 
//
// 示例 2： 
//
// 输入：nums = [7,5,6,8,3]
//输出：1
//解释：
//nums 中最小的数是 3
//nums 中最大的数是 8
//3 和 8 的最大公约数是 1
// 
//
// 示例 3： 
//
// 输入：nums = [3,3]
//输出：3
//解释：
//nums 中最小的数是 3
//nums 中最大的数是 3
//3 和 3 的最大公约数是 3
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 1000 
// 1 <= nums[i] <= 1000 
// 
// Related Topics 数组 数学 数论 👍 28 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 1979.找出数组的最大公约数.find-greatest-common-divisor-of-array
 *
 * @author wangcy
 * @since  2022-09-21 15:46:10
 **/

  public class Solution_1979{
      public static void main(String[] args) {

          Solution solution = new Solution_1979().new Solution();
          int[] nums = {3,3};
          int gcd = solution.findGCD(nums);
          System.out.println(gcd);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int ans = 1;
        for (int i = 1; i <=max ; i++) {
            if(min % i == 0 && max % i == 0){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }