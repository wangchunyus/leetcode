

//给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。 
//
// 注意：n 个元素的平均值等于 n 个元素 求和 再除以 n ，结果 向下取整 到最接近的整数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,6,10,12,15]
//输出：9
//解释：6 和 12 是可以被 3 整除的偶数。(6 + 12) / 2 = 9 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,4,7,10]
//输出：0
//解释：不存在满足题目要求的整数，所以返回 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// 1 <= nums[i] <= 1000 
// 
//
// Related Topics 数组 数学 👍 3 👎 0


package array数组.leetcode.editor.cn;

 /**
 * 2455.可被三整除的偶数的平均值.average-value-of-even-numbers-that-are-divisible-by-three
 *
 * @author wangcy
 * @since  2022-11-02 17:02:36
 **/

  public class Solution_2455{
      public static void main(String[] args) {
           Solution solution = new Solution_2455().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public int averageValue(int[] nums) {
              int totSum = 0;
              int cnt = 0;
              for (int x: nums){
                  if (x % 6 == 0){
                      totSum += x;
                      cnt += 1;
                  }
              }

              return (cnt != 0 ? totSum / cnt : 0);
          }
      }
//leetcode submit region end(Prohibit modification and deletion)

  }