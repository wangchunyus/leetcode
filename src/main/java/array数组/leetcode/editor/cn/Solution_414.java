

//给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3, 2, 1]
//输出：1
//解释：第三大的数是 1 。 
//
// 示例 2： 
//
// 
//输入：[1, 2]
//输出：2
//解释：第三大的数不存在, 所以返回最大的数 2 。
// 
//
// 示例 3： 
//
// 
//输入：[2, 2, 3, 1]
//输出：1
//解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
//此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能设计一个时间复杂度 O(n) 的解决方案吗？ 
// Related Topics 数组 排序 👍 361 👎 0


package array数组.leetcode.editor.cn;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 414.第三大的数.third-maximum-number
 *
 * @author wangcy
 * @since  2022-06-02 14:53:55
 **/

  public class Solution_414{
      public static void main(String[] args) {

          Solution solution = new Solution_414().new Solution();
          int[] nums = {2, 2, 3, 1};
          int i = solution.thirdMax(nums);
          System.out.println(i);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i<nums.length ;i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size() < 3? list.get(list.size()-1):list.get(list.size()-3);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }