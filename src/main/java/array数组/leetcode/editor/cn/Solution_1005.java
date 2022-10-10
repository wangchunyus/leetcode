

//给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组： 
//
// 
// 选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。 
// 
//
// 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。 
//
// 以这种方式修改数组后，返回数组 可能的最大和 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [4,2,3], k = 1
//输出：5
//解释：选择下标 1 ，nums 变为 [4,-2,3] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,-1,0,2], k = 3
//输出：6
//解释：选择下标 (1, 2, 2) ，nums 变为 [3,1,0,2] 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [2,-3,-1,5,-4], k = 2
//输出：13
//解释：选择下标 (1, 4) ，nums 变为 [2,3,-1,5,4] 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -100 <= nums[i] <= 100 
// 1 <= k <= 10⁴ 
// 
// Related Topics 贪心 数组 排序 👍 261 👎 0


package array数组.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 1005.K 次取反后最大化的数组和.maximize-sum-of-array-after-k-negations
 *
 * @author wangcy
 * @since  2022-07-07 11:36:49
 **/

  public class Solution_1005{
      public static void main(String[] args) {

          Solution solution = new Solution_1005().new Solution();

      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        //先修改负数
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        //在根据k的情况 处理不同的 问题
        int addNum = 0;
        if(k  != 0 ){
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    k = 0;
                    break;
                }else if( k % 2 == 0){
                    //剩余的k是偶数
                    break;
                }else{
                    //奇数
                    nums[i] = -nums[i];
                    k = 0;
                    break;
                }
            }
        }
        //求和
        for (int i = 0; i < nums.length; i++) {
            addNum+=nums[i];
        }
        return addNum;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }