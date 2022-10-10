

//给你一个长度为 n 的整数数组 nums 。 
//
// 考虑 nums 中进行 按位与（bitwise AND）运算得到的值 最大 的 非空 子数组。 
//
// 
// 换句话说，令 k 是 nums 任意 子数组执行按位与运算所能得到的最大值。那么，只需要考虑那些执行一次按位与运算后等于 k 的子数组。 
// 
//
// 返回满足要求的 最长 子数组的长度。 
//
// 数组的按位与就是对数组中的所有数字进行按位与运算。 
//
// 子数组 是数组中的一个连续元素序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,3,2,2]
//输出：2
//解释：
//子数组按位与运算的最大值是 3 。
//能得到此结果的最长子数组是 [3,3]，所以返回 2 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：1
//解释：
//子数组按位与运算的最大值是 4 。 
//能得到此结果的最长子数组是 [4]，所以返回 1 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// 1 <= nums[i] <= 10⁶ 
// 
// 👍 6 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 2419.按位与最大的最长子数组.longest-subarray-with-maximum-bitwise-and
 *
 * @author wangcy
 * @since  2022-09-26 16:18:24
 **/

  public class Solution_2419{
      public static void main(String[] args) {
           Solution solution = new Solution_2419().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSubarray(int[] nums) {
        //输入：nums = [1,2,3,3,2,2]
        //输出：2
        //解释：
        //子数组按位与运算的最大值是 3 。
        //能得到此结果的最长子数组是 [3,3]，所以返回 2 。
        /*
        按位与 取最大值
         */
        int max = nums[0];
        int maxSubLenght = 0;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == max){
                //当前值等于 最大值 临时长度++
                temp++;
            }else if (nums[i] > max){
                //当前数值大于目前最大值 。重置参数
                max = nums[i];
                maxSubLenght = 0;
                temp = 1;
            }else {
                //记录临时长度结束  比较临时的子数组长度和最大子数组长度
                if(maxSubLenght < temp){
                    maxSubLenght = temp;
                }
                temp = 0;
            }
        }
        if(maxSubLenght < temp){
            maxSubLenght = temp;
        }
        return maxSubLenght;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }