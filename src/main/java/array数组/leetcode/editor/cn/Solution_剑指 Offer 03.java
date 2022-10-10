


//找出数组中重复的数字。 
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 排序 👍 875 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 剑指 Offer 03.数组中重复的数字.shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 *
 * @author wangcy
 * @since  2022-06-27 17:25:35
 **/

 class Offer_03{
      public static void main(String[] args) {

          Solution solution = new Offer_03().new Solution();
          int[] arr = {2, 3, 1, 0, 2, 5, 3};
          int repeatNumber = solution.findRepeatNumber(arr);
          System.out.println(repeatNumber);

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = length-1; i > 0 ; i--) {
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return 0;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }