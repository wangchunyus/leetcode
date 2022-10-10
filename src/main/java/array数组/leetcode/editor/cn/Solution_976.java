

//给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。如果不能形成任何面积不为零的三角形，返回 0。
// 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,1,2]
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10⁴ 
// 1 <= nums[i] <= 10⁶ 
// 
// Related Topics 贪心 数组 数学 排序 👍 197 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 976.三角形的最大周长.largest-perimeter-triangle
 *
 * @author wangcy
 * @since  2022-07-13 10:25:27
 **/

  public class Solution_976{
      public static void main(String[] args) {

          Solution solution = new Solution_976().new Solution();
          int[] num = {1,2,1};
          int i = solution.largestPerimeter(num);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3 ) return 0;
        for (int i = nums.length-3; i >=0 ; i--) {
            if(nums[i]+nums[i+1] > nums[i+2] && nums[i+1]+nums[i+2] > nums[i] && nums[i]+nums[i+2] > nums[i+1]){
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }