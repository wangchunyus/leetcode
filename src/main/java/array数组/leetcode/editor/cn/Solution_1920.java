

//给你一个 从 0 开始的排列 nums（下标也从 0 开始）。请你构建一个 同样长度 的数组 ans ，其中，对于每个 i（0 <= i < nums.
//length），都满足 ans[i] = nums[nums[i]] 。返回构建好的数组 ans 。 
//
// 从 0 开始的排列 nums 是一个由 0 到 nums.length - 1（0 和 nums.length - 1 也包含在内）的不同整数组成的数组。
// 
//
// 
//
// 示例 1： 
//
// 输入：nums = [0,2,1,5,3,4]
//输出：[0,1,2,4,5,3]
//解释：数组 ans 构建如下：
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4
//]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3] 
//
// 示例 2： 
//
// 输入：nums = [5,0,1,2,3,4]
//输出：[4,5,0,1,2,3]
//解释：数组 ans 构建如下：
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4
//]], nums[nums[5]]]
//    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
//    = [4,5,0,1,2,3] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// 0 <= nums[i] < nums.length 
// nums 中的元素 互不相同 
// 
// Related Topics 数组 模拟 👍 39 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 1920.基于排列构建数组.build-array-from-permutation
 *
 * @author wangcy
 * @since  2022-08-10 11:04:47
 **/

  public class Solution_1920{
      public static void main(String[] args) {
           Solution solution = new Solution_1920().new Solution();
           int[] nums = {0,2,1,5,3,4};
          int[] ints = solution.buildArray(nums);
          for (int anInt : ints) {
              System.out.print(anInt+",");
          }
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] buildArray(int[] nums) {
            // 输入：nums = [0,2,1,5,3,4]
            //输出：[0,1,2,4,5,3]
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[nums[i]]);
        }
        int[] res = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            res[j] = map.get(j);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }