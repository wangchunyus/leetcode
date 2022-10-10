

//给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,0,1,1,1]
//输出：3
//解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
// 
//
// 示例 2: 
//
// 
//输入：nums = [1,0,1,1,0,1]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] 不是 0 就是 1. 
// 
// Related Topics 数组 👍 321 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 485.最大连续 1 的个数.max-consecutive-ones
 *
 * @author wangcy
 * @since  2022-06-06 14:05:18
 **/

  public class Solution_485{
      public static void main(String[] args) {

          Solution solution = new Solution_485().new Solution();
          int[] arra = {1,1,1};
          int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(arra);
          System.out.println(maxConsecutiveOnes);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
            }else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return max> count ? max: count;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }