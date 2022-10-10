

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [1,1,2,2,3]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表 
// 👍 1884 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 136.只出现一次的数字.single-number
 *
 * @author wangcy
 * @since  2021-06-07 17:36:29
 **/

  public class Solution_136{
      public static void main(String[] args) {

          Solution solution = new Solution_136().new Solution();
          int[] nums = {4,1,2,1,2};
          solution.singleNumber(nums);



      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
       int args = nums[0];
        for (int i = 1; i < nums.length; i++) {
            args = args ^ nums[i];
        }

        return args;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }